package com.currencyconverter.dto.cbrPreciousMetals;

public class Record {

        private String Sell;

        private String Buy;

        private String Code;

        private String Date;

        public String getSell ()
        {
            return Sell;
        }

        public void setSell (String Sell)
        {
            this.Sell = Sell;
        }

        public String getBuy ()
        {
            return Buy;
        }

        public void setBuy (String Buy)
        {
            this.Buy = Buy;
        }

        public String getCode ()
        {
            return Code;
        }

        public void setCode (String Code)
        {
            this.Code = Code;
        }

        public String getDate ()
        {
            return Date;
        }

        public void setDate (String Date)
        {
            this.Date = Date;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [Sell = "+Sell+", Buy = "+Buy+", Code = "+Code+", Date = "+Date+"]";
        }
    }


