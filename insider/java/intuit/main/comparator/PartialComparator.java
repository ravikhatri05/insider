package intuit.main.comparator;

import intuit.main.model.InvoiceModel;

import java.util.Comparator;

public class PartialComparator implements Comparator<InvoiceModel> {

    @Override
    public int compare(InvoiceModel o1, InvoiceModel other) {
        InvoiceModel.class.getFields();
        if((o1.getName() == null && other.getName() == null)
                || (o1.getName() != null && o1.getName().equals(other.getName()))){
            return 0;
        }

        if((o1.getDate() == null && other.getDate() == null)
                || (o1.getDate() != null && o1.getDate().equals(other.getDate()))){
            return 0;
        }
        if((o1.getBillNumber() == null && other.getBillNumber() == null)
                || (o1.getBillNumber() != null && o1.getBillNumber().equals(other.getBillNumber()))){
            return 0;
        }if((o1.getGstRate() == null && other.getGstRate() == null)
                || (o1.getGstRate() != null && o1.getGstRate().equals(other.getGstRate()))){
            return 0;
        }
        if((o1.getTaxableValue() == null && other.getTaxableValue() == null)
                || (o1.getTaxableValue() != null && o1.getTaxableValue().equals(other.getTaxableValue()))){
            return 0;
        }if((o1.getIgst() == null && other.getIgst() == null)
                || (o1.getIgst() != null && o1.getIgst().equals(other.getIgst()))){
            return 0;
        }
        if((o1.getCgst() == null && other.getCgst() == null)
                || (o1.getCgst() != null && o1.getCgst().equals(other.getCgst()))){
            return 0;
        }if((o1.getSgst() == null && other.getSgst() == null)
                || (o1.getSgst() != null && o1.getSgst().equals(other.getSgst()))){
            return 0;
        }
        if((o1.getTotal() == null && other.getTotal() == null)
                || (o1.getTotal() != null && o1.getTotal().equals(other.getTotal()))){
            return 0;
        }
        return 1;
    }

}
