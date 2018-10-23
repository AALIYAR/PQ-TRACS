package com.pq.tracs.view.beans;

import com.pq.tracs.model.services.TracsServiceImpl;

import java.util.Iterator;

import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCDataControl;
import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.event.DialogEvent;

import oracle.jbo.Row;
import oracle.jbo.domain.ClobDomain;
import oracle.jbo.domain.Number;
import oracle.jbo.uicli.binding.JUCtrlHierNodeBinding;

import org.apache.myfaces.trinidad.model.RowKeySet;
import org.apache.myfaces.trinidad.render.ExtendedRenderKitService;

public class AddTitleNoteBean extends TableMultiDeleteBean {
    public void setAddNotePopup(RichPopup addNotePopup) {
        this.addNotePopup = addNotePopup;
    }

    public void addNotes(ActionEvent actionEvent) {

        newNote = new ClobDomain();
        newNoteType = new String();

        RichTable table = this.getTable();
        RowKeySet keys = table.getSelectedRowKeys();
        Iterator keyIter = keys.iterator();

        FacesContext fctx = FacesContext.getCurrentInstance();
        StringBuilder script = new StringBuilder();
        String popupId;

        if (!keyIter.hasNext()) {
            popupId = noSelectionPopup.getClientId(fctx);
        } else {
            StringBuilder catList = new StringBuilder();
            while (keyIter.hasNext()) {
                Object key = keyIter.next();
                table.setRowKey(key);
                Row row = ((JUCtrlHierNodeBinding)table.getRowData()).getRow();

                catList.append((String)row.getAttribute("CatalogNumber"));
                if (keyIter.hasNext()) {
                    catList.append(", ");
                }
            }
            this.catalogList = catList.toString();
            popupId = addNotePopup.getClientId(fctx);
        }

        script.append("var popup = AdfPage.PAGE.findComponent(\"").append(popupId).append("\");").append("var hints = {align:\"after_start\", alignId:\"").append(buttonId).append("\"};").append("popup.show(hints);");

        ExtendedRenderKitService erks =
            org.apache.myfaces.trinidad.util.Service.getRenderKitService(fctx,
                                                                         ExtendedRenderKitService.class);
        erks.addScript(fctx, script.toString());

    }

    public String getCatalogList() {
        return catalogList;
    }

    public ClobDomain getNewNote() {
        return newNote;
    }

    public void setNewNote(ClobDomain newNote) {
        this.newNote = newNote;
    }

    public void setNewNoteType(String newNoteType) {
        this.newNoteType = newNoteType;
    }

    public void handleAddNoteOK(DialogEvent dialogEvent) {

        if (dialogEvent.getOutcome().equals(DialogEvent.Outcome.ok)) {
            RichTable table = this.getTable();
            RowKeySet keys = table.getSelectedRowKeys();
            Iterator keyIter = keys.iterator();

            FacesContext context = FacesContext.getCurrentInstance();
            BindingContext bindingContext = BindingContext.getCurrent();
            DCDataControl dc =
                bindingContext.findDataControl("TracsServiceDataControl");

            TracsServiceImpl appM = (TracsServiceImpl)dc.getDataProvider();
            String tNote = null;

            if (!this.newNoteType.isEmpty() && this.newNoteType.length() > 0) {
                tNote =
                        (String)appM.getTitleNoteTypeLookup().getRowAtRangeIndex(Integer.decode(this.newNoteType).intValue()).getAttribute("InternalValue");
            }

            while (keyIter.hasNext()) {
                Object key = keyIter.next();
                table.setRowKey(key);
                Row row = ((JUCtrlHierNodeBinding)table.getRowData()).getRow();
                appM.createTitleNote((Number)row.getAttribute(titleId), tNote,
                                     this.newNote);

            }
        }
    }

    public RichPopup getNoSelectionPopup() {
        return noSelectionPopup;
    }

    public void setNoSelectionPopup(RichPopup noSelectionPopup) {
        this.noSelectionPopup = noSelectionPopup;
    }

    public void setCatalogList(String catalogList) {
        this.catalogList = catalogList;
    }

    public RichPopup getAddNotePopup() {
        return addNotePopup;
    }

    public String getNewNoteType() {
        return newNoteType;
    }
    protected RichPopup addNotePopup;
    protected RichPopup noSelectionPopup;
    protected ClobDomain newNote;
    protected String newNoteType;
    protected String catalogList;
    protected String titleId;
    protected String buttonId;
}
