
package com.currencyconverter.dto.cbr.metals.json;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AED",
    "AFN",
    "ALL",
    "AMD",
    "ANG",
    "AOA",
    "ARS",
    "AUD",
    "AWG",
    "AZN",
    "BAM",
    "BBD",
    "BCH",
    "BDT",
    "BGN",
    "BHD",
    "BIF",
    "BMD",
    "BND",
    "BOB",
    "BRL",
    "BSD",
    "BTC",
    "BTN",
    "BWP",
    "BYN",
    "BYR",
    "BZD",
    "CAD",
    "CDF",
    "CHF",
    "CLF",
    "CLP",
    "CNH",
    "CNY",
    "COP",
    "CRC",
    "CUC",
    "CVE",
    "CZK",
    "DJF",
    "DKK",
    "DOP",
    "DZD",
    "EEK",
    "EGP",
    "ERN",
    "ETB",
    "ETH",
    "EUR",
    "FJD",
    "FKP",
    "GBP",
    "GEL",
    "GGP",
    "GHS",
    "GIP",
    "GMD",
    "GNF",
    "GTQ",
    "GYD",
    "HKD",
    "HNL",
    "HRK",
    "HTG",
    "HUF",
    "IDR",
    "ILS",
    "IMP",
    "INR",
    "IQD",
    "ISK",
    "JEP",
    "JMD",
    "JOD",
    "JPY",
    "KES",
    "KGS",
    "KHR",
    "KMF",
    "KRW",
    "KWD",
    "KYD",
    "KZT",
    "LAK",
    "LBP",
    "LKR",
    "LRD",
    "LSL",
    "LTC",
    "LTL",
    "LVL",
    "LYD",
    "MAD",
    "MDL",
    "MGA",
    "MKD",
    "MMK",
    "MNT",
    "MOP",
    "MRO",
    "MTL",
    "MUR",
    "MVR",
    "MWK",
    "MXN",
    "MYR",
    "MZN",
    "NAD",
    "NGN",
    "NIO",
    "NOK",
    "NPR",
    "NZD",
    "OMR",
    "PAB",
    "PEN",
    "PGK",
    "PHP",
    "PKR",
    "PLN",
    "PYG",
    "QAR",
    "RON",
    "RSD",
    "RUB",
    "RWF",
    "SAR",
    "SBD",
    "SCR",
    "SEK",
    "SGD",
    "SHP",
    "SLL",
    "SOS",
    "SRD",
    "SSP",
    "STD",
    "SVC",
    "SZL",
    "THB",
    "TJS",
    "TMT",
    "TND",
    "TOP",
    "TRY",
    "TTD",
    "TWD",
    "TZS",
    "UAH",
    "UGX",
    "USD",
    "UYU",
    "UZS",
    "VEF",
    "VES",
    "VND",
    "VUV",
    "WST",
    "XAF",
    "XAG",
    "XAU",
    "XCD",
    "XDR",
    "XOF",
    "XPD",
    "XPF",
    "XPT",
    "XRP",
    "YER",
    "ZAR",
    "ZMK",
    "ZMW",
    "ZWL",
    "XRH"
})
@Data
public class Rates {

    @JsonProperty("AED")
    private Double aED;
    @JsonProperty("AFN")
    private Double aFN;
    @JsonProperty("ALL")
    private Double aLL;
    @JsonProperty("AMD")
    private Double aMD;
    @JsonProperty("ANG")
    private Double aNG;
    @JsonProperty("AOA")
    private Double aOA;
    @JsonProperty("ARS")
    private Double aRS;
    @JsonProperty("AUD")
    private Double aUD;
    @JsonProperty("AWG")
    private Double aWG;
    @JsonProperty("AZN")
    private Double aZN;
    @JsonProperty("BAM")
    private Double bAM;
    @JsonProperty("BBD")
    private Double bBD;
    @JsonProperty("BCH")
    private Double bCH;
    @JsonProperty("BDT")
    private Double bDT;
    @JsonProperty("BGN")
    private Double bGN;
    @JsonProperty("BHD")
    private Double bHD;
    @JsonProperty("BIF")
    private Double bIF;
    @JsonProperty("BMD")
    private Double bMD;
    @JsonProperty("BND")
    private Double bND;
    @JsonProperty("BOB")
    private Double bOB;
    @JsonProperty("BRL")
    private Double bRL;
    @JsonProperty("BSD")
    private Double bSD;
    @JsonProperty("BTC")
    private Double bTC;
    @JsonProperty("BTN")
    private Double bTN;
    @JsonProperty("BWP")
    private Double bWP;
    @JsonProperty("BYN")
    private Double bYN;
    @JsonProperty("BYR")
    private Double bYR;
    @JsonProperty("BZD")
    private Double bZD;
    @JsonProperty("CAD")
    private Double cAD;
    @JsonProperty("CDF")
    private Double cDF;
    @JsonProperty("CHF")
    private Double cHF;
    @JsonProperty("CLF")
    private Double cLF;
    @JsonProperty("CLP")
    private Double cLP;
    @JsonProperty("CNH")
    private Double cNH;
    @JsonProperty("CNY")
    private Double cNY;
    @JsonProperty("COP")
    private Double cOP;
    @JsonProperty("CRC")
    private Double cRC;
    @JsonProperty("CUC")
    private Double cUC;
    @JsonProperty("CVE")
    private Double cVE;
    @JsonProperty("CZK")
    private Double cZK;
    @JsonProperty("DJF")
    private Double dJF;
    @JsonProperty("DKK")
    private Double dKK;
    @JsonProperty("DOP")
    private Double dOP;
    @JsonProperty("DZD")
    private Double dZD;
    @JsonProperty("EEK")
    private Double eEK;
    @JsonProperty("EGP")
    private Double eGP;
    @JsonProperty("ERN")
    private Double eRN;
    @JsonProperty("ETB")
    private Double eTB;
    @JsonProperty("ETH")
    private Double eTH;
    @JsonProperty("EUR")
    private Double eUR;
    @JsonProperty("FJD")
    private Double fJD;
    @JsonProperty("FKP")
    private Double fKP;
    @JsonProperty("GBP")
    private Double gBP;
    @JsonProperty("GEL")
    private Double gEL;
    @JsonProperty("GGP")
    private Double gGP;
    @JsonProperty("GHS")
    private Double gHS;
    @JsonProperty("GIP")
    private Double gIP;
    @JsonProperty("GMD")
    private Double gMD;
    @JsonProperty("GNF")
    private Double gNF;
    @JsonProperty("GTQ")
    private Double gTQ;
    @JsonProperty("GYD")
    private Double gYD;
    @JsonProperty("HKD")
    private Double hKD;
    @JsonProperty("HNL")
    private Double hNL;
    @JsonProperty("HRK")
    private Double hRK;
    @JsonProperty("HTG")
    private Double hTG;
    @JsonProperty("HUF")
    private Double hUF;
    @JsonProperty("IDR")
    private Double iDR;
    @JsonProperty("ILS")
    private Double iLS;
    @JsonProperty("IMP")
    private Double iMP;
    @JsonProperty("INR")
    private Double iNR;
    @JsonProperty("IQD")
    private Double iQD;
    @JsonProperty("ISK")
    private Double iSK;
    @JsonProperty("JEP")
    private Double jEP;
    @JsonProperty("JMD")
    private Double jMD;
    @JsonProperty("JOD")
    private Double jOD;
    @JsonProperty("JPY")
    private Double jPY;
    @JsonProperty("KES")
    private Double kES;
    @JsonProperty("KGS")
    private Double kGS;
    @JsonProperty("KHR")
    private Double kHR;
    @JsonProperty("KMF")
    private Double kMF;
    @JsonProperty("KRW")
    private Double kRW;
    @JsonProperty("KWD")
    private Double kWD;
    @JsonProperty("KYD")
    private Double kYD;
    @JsonProperty("KZT")
    private Double kZT;
    @JsonProperty("LAK")
    private Double lAK;
    @JsonProperty("LBP")
    private Double lBP;
    @JsonProperty("LKR")
    private Double lKR;
    @JsonProperty("LRD")
    private Double lRD;
    @JsonProperty("LSL")
    private Double lSL;
    @JsonProperty("LTC")
    private Double lTC;
    @JsonProperty("LTL")
    private Double lTL;
    @JsonProperty("LVL")
    private Double lVL;
    @JsonProperty("LYD")
    private Double lYD;
    @JsonProperty("MAD")
    private Double mAD;
    @JsonProperty("MDL")
    private Double mDL;
    @JsonProperty("MGA")
    private Double mGA;
    @JsonProperty("MKD")
    private Double mKD;
    @JsonProperty("MMK")
    private Double mMK;
    @JsonProperty("MNT")
    private Double mNT;
    @JsonProperty("MOP")
    private Double mOP;
    @JsonProperty("MRO")
    private Double mRO;
    @JsonProperty("MTL")
    private Double mTL;
    @JsonProperty("MUR")
    private Double mUR;
    @JsonProperty("MVR")
    private Double mVR;
    @JsonProperty("MWK")
    private Double mWK;
    @JsonProperty("MXN")
    private Double mXN;
    @JsonProperty("MYR")
    private Double mYR;
    @JsonProperty("MZN")
    private Double mZN;
    @JsonProperty("NAD")
    private Double nAD;
    @JsonProperty("NGN")
    private Double nGN;
    @JsonProperty("NIO")
    private Double nIO;
    @JsonProperty("NOK")
    private Double nOK;
    @JsonProperty("NPR")
    private Double nPR;
    @JsonProperty("NZD")
    private Double nZD;
    @JsonProperty("OMR")
    private Double oMR;
    @JsonProperty("PAB")
    private Double pAB;
    @JsonProperty("PEN")
    private Double pEN;
    @JsonProperty("PGK")
    private Double pGK;
    @JsonProperty("PHP")
    private Double pHP;
    @JsonProperty("PKR")
    private Double pKR;
    @JsonProperty("PLN")
    private Double pLN;
    @JsonProperty("PYG")
    private Double pYG;
    @JsonProperty("QAR")
    private Double qAR;
    @JsonProperty("RON")
    private Double rON;
    @JsonProperty("RSD")
    private Double rSD;
    @JsonProperty("RUB")
    private Double rUB;
    @JsonProperty("RWF")
    private Double rWF;
    @JsonProperty("SAR")
    private Double sAR;
    @JsonProperty("SBD")
    private Double sBD;
    @JsonProperty("SCR")
    private Double sCR;
    @JsonProperty("SEK")
    private Double sEK;
    @JsonProperty("SGD")
    private Double sGD;
    @JsonProperty("SHP")
    private Double sHP;
    @JsonProperty("SLL")
    private Double sLL;
    @JsonProperty("SOS")
    private Double sOS;
    @JsonProperty("SRD")
    private Double sRD;
    @JsonProperty("SSP")
    private Double sSP;
    @JsonProperty("STD")
    private Double sTD;
    @JsonProperty("SVC")
    private Double sVC;
    @JsonProperty("SZL")
    private Double sZL;
    @JsonProperty("THB")
    private Double tHB;
    @JsonProperty("TJS")
    private Double tJS;
    @JsonProperty("TMT")
    private Double tMT;
    @JsonProperty("TND")
    private Double tND;
    @JsonProperty("TOP")
    private Double tOP;
    @JsonProperty("TRY")
    private Double tRY;
    @JsonProperty("TTD")
    private Double tTD;
    @JsonProperty("TWD")
    private Double tWD;
    @JsonProperty("TZS")
    private Double tZS;
    @JsonProperty("UAH")
    private Double uAH;
    @JsonProperty("UGX")
    private Double uGX;
    @JsonProperty("USD")
    private Integer uSD;
    @JsonProperty("UYU")
    private Double uYU;
    @JsonProperty("UZS")
    private Double uZS;
    @JsonProperty("VEF")
    private Double vEF;
    @JsonProperty("VES")
    private Double vES;
    @JsonProperty("VND")
    private Double vND;
    @JsonProperty("VUV")
    private Double vUV;
    @JsonProperty("WST")
    private Double wST;
    @JsonProperty("XAF")
    private Double xAF;
    @JsonProperty("XAG")
    private Double xAG;
    @JsonProperty("XAU")
    private Double xAU;
    @JsonProperty("XCD")
    private Double xCD;
    @JsonProperty("XDR")
    private Double xDR;
    @JsonProperty("XOF")
    private Double xOF;
    @JsonProperty("XPD")
    private Double xPD;
    @JsonProperty("XPF")
    private Double xPF;
    @JsonProperty("XPT")
    private Double xPT;
    @JsonProperty("XRP")
    private Double xRP;
    @JsonProperty("YER")
    private Double yER;
    @JsonProperty("ZAR")
    private Double zAR;
    @JsonProperty("ZMK")
    private Double zMK;
    @JsonProperty("ZMW")
    private Double zMW;
    @JsonProperty("ZWL")
    private Double zWL;
    @JsonProperty("XRH")
    private Double xRH;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

}
