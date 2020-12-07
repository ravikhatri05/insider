package intuit.main.model;

public class InvoiceModel {
    private String  name;
    private Long gstin;
    private String date ;
    private Long billNumber;
    private Float gstRate;
    private Double taxableValue;
    private Float igst;
    private Float cgst;
    private Float sgst;
    private Double total;

    public InvoiceModel(String name,Long gstin, String date,long billNumber, float gstRate, double taxableValue,
                               float igst, float cgst, float sgst , double total) {
        this.name = name;
        this.gstin= gstin;
        this.date = date;
        this.billNumber = billNumber;
        this.gstRate = gstRate;
        this.taxableValue = taxableValue;
        this.igst = igst;
        this.cgst = cgst;
        this.sgst = sgst;
        this.total = total;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;

    }

    public void setBillNumber(Long billNumber) {
        this.billNumber = billNumber;

    }

    public void setGstRate(Float gstRate) {
        this.gstRate = gstRate;

    }
    public void setIGstRate(float igst) {
        this.igst = igst;

    }public void setSGstRate(float sgst) {
        this.sgst = sgst;

    }
    public void setCGstRate(float cgst) {
        this.cgst = cgst;

    }

    public Float getSgst() {
        return sgst;
    }
    public Float getCgst() {
        return cgst;
    }

    public Float getIgst() {
        return igst;
    }

    public Double getTaxableValue() {
        return taxableValue;
    }

    public Float getGstRate() {
        return gstRate;
    }

    public Long getBillNumber() {
        return billNumber;
    }

    public String getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public void setTaxableValue(Double taxableValue) {
        this.taxableValue = taxableValue;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof InvoiceModel))
            return false;
        InvoiceModel other = (InvoiceModel)o;
        boolean nameEquals = (this.name == null && other.name == null)
                || (this.name != null && this.name.equals(other.name));

        boolean dateEquals = (this.date == null && other.date == null)
                || (this.date != null && this.date.equals(other.date));
        boolean billNumberEquals = (this.billNumber == null && other.billNumber == null)
                || (this.billNumber != null && this.billNumber.equals(other.billNumber));
        boolean gstRateEquals = (this.gstRate == null && other.gstRate == null)
                || (this.gstRate != null && this.gstRate.equals(other.gstRate));
        boolean taxableValueEquals = (this.taxableValue == null && other.taxableValue == null)
                || (this.taxableValue != null && this.taxableValue.equals(other.taxableValue));

        boolean igstEquals = (this.igst == null && other.igst == null)
                || (this.igst != null && this.igst.equals(other.igst));
        boolean cgstEquals = (this.cgst == null && other.cgst == null)
                || (this.cgst != null && this.cgst.equals(other.cgst));
        boolean sgstEquals = (this.sgst == null && other.sgst == null)
                || (this.sgst != null && this.sgst.equals(other.sgst));
        boolean toalEquals = (this.total == null && other.total == null)
                || (this.total != null && this.total.equals(other.total));
        return nameEquals && dateEquals && billNumberEquals && gstRateEquals && taxableValueEquals && igstEquals && cgstEquals && sgstEquals && toalEquals;
    }

    public Long getGstin() {
        return gstin;
    }

    public void setGstin(Long gstin) {
        this.gstin = gstin;
    }

    public static class InvoiceModelBuilder {

        private String  name;
        private Long gstin;
        private String date ;
        private long billNumber;
        private float gstRate;
        private double taxableValue;
        private float igst;
        private float cgst;
        private float sgst;
        private double total;

        public InvoiceModelBuilder(String name,Long gstin, String date,long billNumber, float gstRate, double taxableValue,
                           float igst, float cgst, float sgst , double total) {
            this.name = name;
            this.date = date;
            this.billNumber = billNumber;
            this.gstRate = gstRate;
            this.taxableValue = taxableValue;
            this.igst = igst;
            this.cgst = cgst;
            this.sgst = sgst;
            this.total = total;
        }

        public InvoiceModelBuilder() {

        }

        public InvoiceModelBuilder setTotal(double total) {
            this.total = total;
            return this;
        }

        public InvoiceModelBuilder setTaxableValue(double taxableValue) {
            this.taxableValue = taxableValue;
            return this;
        }

        public InvoiceModelBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public InvoiceModelBuilder setDate(String date) {
            this.date = date;
            return this;
        }

        public InvoiceModelBuilder setBillNumber(long billNumber) {
            this.billNumber = billNumber;
            return this;
        }

        public InvoiceModelBuilder setGstRate(float gstRate) {
            this.gstRate = gstRate;
            return this;
        }
        public InvoiceModelBuilder setIGstRate(float igst) {
            this.igst = igst;
            return this;
        }public InvoiceModelBuilder setSGstRate(float sgst) {
            this.sgst = sgst;
            return this;
        }
        public InvoiceModelBuilder setCGstRate(float cgst) {
            this.cgst = cgst;
            return this;
        }
        public InvoiceModelBuilder setGstin(Long gstin) {
            this.gstin = gstin;
            return this;
        }
        public InvoiceModel build() {
            return new InvoiceModel(name, gstin ,date, billNumber, gstRate, taxableValue, igst, cgst, sgst , total);
        }


    }
}
