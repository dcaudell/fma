
package com.xtrafe.server.ejb.xignite;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChartDesign complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChartDesign">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}Common">
 *       &lt;sequence>
 *         &lt;element name="Secure" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="TextTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TextHeader" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TextFooter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TextPriceLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TextVolumeBar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TextHighest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TextLowest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TextOpen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TextClose" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TextUp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TextDown" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ColorBackground" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ColorBackWall" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ColorVolumeBackWall" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShowVolumeBackWall" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ColorHighlight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ColorPriceLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ColorVolumeBar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ColorVolumeBarFill" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ColorHigh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ColorStickUp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ColorStickLow" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ColorConstant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ColorLow" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ColorPoint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ColorTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ColorFooter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ColorHeader" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ColorAxis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ColorGrid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ColorFonts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ColorStripe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ColorOpen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ColorClose" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ColorVerticalGrid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ColorHorizontalGrid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ColorUp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ColorDown" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ColorHighLowLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ColorCollection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GridHorizontalStyle" type="{http://www.xignite.com/services/}LinePattern"/>
 *         &lt;element name="GridVerticalStyle" type="{http://www.xignite.com/services/}LinePattern"/>
 *         &lt;element name="GridHorizontalWidth" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="GridVerticalWidth" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ColorFrame" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FrameBorder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FormatPriceLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FormatVolume" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FormatDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GradeBackground" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="GradeBackwall" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="WaterMark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WaterMarkTopMargin" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="WaterMarkLeftMargin" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="WaterMarkTransparency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PointSize" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="StackVariationLabels" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ShowAxisLabelInLegend" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="LineWidth" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SplitPercent" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ShowHigh" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ShowLow" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ShowOpen" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ShowClose" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ShowVolume" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ShowUpVariation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ShowDownVariation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ShowLegend" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="VariationYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="VolumeDivider" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="VolumeTextOffset" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PriceTextOffset" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FrameType" type="{http://www.xignite.com/services/}ImageFrameType"/>
 *         &lt;element name="Projection" type="{http://www.xignite.com/services/}PredefinedProjection"/>
 *         &lt;element name="MarginTop" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MarginBottom" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MarginLeft" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MarginRight" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FontFamily" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FontSizeHeader" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FontSizeFooter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Height" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Width" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ZoomPercent" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LegendBox" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ColorLegendBackground" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ColorLegendBorder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LegendVerticalPosition" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LegendHorizontalPosition" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Reload" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ShowPriceChartLabels" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="TickPrecision" type="{http://www.xignite.com/services/}TickPeriod"/>
 *         &lt;element name="TickPeriods" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="WaterMarkHorizontalAlign" type="{http://www.xignite.com/services/}HorzAlign"/>
 *         &lt;element name="LightScheme" type="{http://www.xignite.com/services/}PredefinedLightModel"/>
 *         &lt;element name="FontSizeLegend" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FontSizeAxes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FontSizeTitle" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DaysForHourDisplay" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DaysForDayDisplay" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DaysForWeekDisplay" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DaysForBiWeeklyDisplay" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DaysForMonthDisplay" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DaysForQuarterDisplay" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DaysForSemiAnnualDisplay" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DaysForAnnualDisplay" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DaysForBiAnnualDisplay" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DaysForPentaAnnualDisplay" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChartDesign", propOrder = {
    "secure",
    "textTitle",
    "textHeader",
    "textFooter",
    "textPriceLine",
    "textVolumeBar",
    "textHighest",
    "textLowest",
    "textOpen",
    "textClose",
    "textUp",
    "textDown",
    "colorBackground",
    "colorBackWall",
    "colorVolumeBackWall",
    "showVolumeBackWall",
    "colorHighlight",
    "colorPriceLine",
    "colorVolumeBar",
    "colorVolumeBarFill",
    "colorHigh",
    "colorStickUp",
    "colorStickLow",
    "colorConstant",
    "colorLow",
    "colorPoint",
    "colorTitle",
    "colorFooter",
    "colorHeader",
    "colorAxis",
    "colorGrid",
    "colorFonts",
    "colorStripe",
    "colorOpen",
    "colorClose",
    "colorVerticalGrid",
    "colorHorizontalGrid",
    "colorUp",
    "colorDown",
    "colorHighLowLine",
    "colorCollection",
    "gridHorizontalStyle",
    "gridVerticalStyle",
    "gridHorizontalWidth",
    "gridVerticalWidth",
    "colorFrame",
    "frameBorder",
    "formatPriceLine",
    "formatVolume",
    "formatDate",
    "gradeBackground",
    "gradeBackwall",
    "waterMark",
    "waterMarkTopMargin",
    "waterMarkLeftMargin",
    "waterMarkTransparency",
    "pointSize",
    "stackVariationLabels",
    "showAxisLabelInLegend",
    "lineWidth",
    "splitPercent",
    "showHigh",
    "showLow",
    "showOpen",
    "showClose",
    "showVolume",
    "showUpVariation",
    "showDownVariation",
    "showLegend",
    "variationYear",
    "volumeDivider",
    "volumeTextOffset",
    "priceTextOffset",
    "frameType",
    "projection",
    "marginTop",
    "marginBottom",
    "marginLeft",
    "marginRight",
    "fontFamily",
    "fontSizeHeader",
    "fontSizeFooter",
    "height",
    "width",
    "zoomPercent",
    "legendBox",
    "colorLegendBackground",
    "colorLegendBorder",
    "legendVerticalPosition",
    "legendHorizontalPosition",
    "reload",
    "showPriceChartLabels",
    "tickPrecision",
    "tickPeriods",
    "waterMarkHorizontalAlign",
    "lightScheme",
    "fontSizeLegend",
    "fontSizeAxes",
    "fontSizeTitle",
    "daysForHourDisplay",
    "daysForDayDisplay",
    "daysForWeekDisplay",
    "daysForBiWeeklyDisplay",
    "daysForMonthDisplay",
    "daysForQuarterDisplay",
    "daysForSemiAnnualDisplay",
    "daysForAnnualDisplay",
    "daysForBiAnnualDisplay",
    "daysForPentaAnnualDisplay"
})
public class ChartDesign
    extends Common
{

    @XmlElement(name = "Secure")
    protected boolean secure;
    @XmlElement(name = "TextTitle")
    protected String textTitle;
    @XmlElement(name = "TextHeader")
    protected String textHeader;
    @XmlElement(name = "TextFooter")
    protected String textFooter;
    @XmlElement(name = "TextPriceLine")
    protected String textPriceLine;
    @XmlElement(name = "TextVolumeBar")
    protected String textVolumeBar;
    @XmlElement(name = "TextHighest")
    protected String textHighest;
    @XmlElement(name = "TextLowest")
    protected String textLowest;
    @XmlElement(name = "TextOpen")
    protected String textOpen;
    @XmlElement(name = "TextClose")
    protected String textClose;
    @XmlElement(name = "TextUp")
    protected String textUp;
    @XmlElement(name = "TextDown")
    protected String textDown;
    @XmlElement(name = "ColorBackground")
    protected String colorBackground;
    @XmlElement(name = "ColorBackWall")
    protected String colorBackWall;
    @XmlElement(name = "ColorVolumeBackWall")
    protected String colorVolumeBackWall;
    @XmlElement(name = "ShowVolumeBackWall")
    protected boolean showVolumeBackWall;
    @XmlElement(name = "ColorHighlight")
    protected String colorHighlight;
    @XmlElement(name = "ColorPriceLine")
    protected String colorPriceLine;
    @XmlElement(name = "ColorVolumeBar")
    protected String colorVolumeBar;
    @XmlElement(name = "ColorVolumeBarFill")
    protected String colorVolumeBarFill;
    @XmlElement(name = "ColorHigh")
    protected String colorHigh;
    @XmlElement(name = "ColorStickUp")
    protected String colorStickUp;
    @XmlElement(name = "ColorStickLow")
    protected String colorStickLow;
    @XmlElement(name = "ColorConstant")
    protected String colorConstant;
    @XmlElement(name = "ColorLow")
    protected String colorLow;
    @XmlElement(name = "ColorPoint")
    protected String colorPoint;
    @XmlElement(name = "ColorTitle")
    protected String colorTitle;
    @XmlElement(name = "ColorFooter")
    protected String colorFooter;
    @XmlElement(name = "ColorHeader")
    protected String colorHeader;
    @XmlElement(name = "ColorAxis")
    protected String colorAxis;
    @XmlElement(name = "ColorGrid")
    protected String colorGrid;
    @XmlElement(name = "ColorFonts")
    protected String colorFonts;
    @XmlElement(name = "ColorStripe")
    protected String colorStripe;
    @XmlElement(name = "ColorOpen")
    protected String colorOpen;
    @XmlElement(name = "ColorClose")
    protected String colorClose;
    @XmlElement(name = "ColorVerticalGrid")
    protected String colorVerticalGrid;
    @XmlElement(name = "ColorHorizontalGrid")
    protected String colorHorizontalGrid;
    @XmlElement(name = "ColorUp")
    protected String colorUp;
    @XmlElement(name = "ColorDown")
    protected String colorDown;
    @XmlElement(name = "ColorHighLowLine")
    protected String colorHighLowLine;
    @XmlElement(name = "ColorCollection")
    protected String colorCollection;
    @XmlElement(name = "GridHorizontalStyle", required = true)
    protected LinePattern gridHorizontalStyle;
    @XmlElement(name = "GridVerticalStyle", required = true)
    protected LinePattern gridVerticalStyle;
    @XmlElement(name = "GridHorizontalWidth")
    protected int gridHorizontalWidth;
    @XmlElement(name = "GridVerticalWidth")
    protected int gridVerticalWidth;
    @XmlElement(name = "ColorFrame")
    protected String colorFrame;
    @XmlElement(name = "FrameBorder")
    protected String frameBorder;
    @XmlElement(name = "FormatPriceLine")
    protected String formatPriceLine;
    @XmlElement(name = "FormatVolume")
    protected String formatVolume;
    @XmlElement(name = "FormatDate")
    protected String formatDate;
    @XmlElement(name = "GradeBackground")
    protected boolean gradeBackground;
    @XmlElement(name = "GradeBackwall")
    protected boolean gradeBackwall;
    @XmlElement(name = "WaterMark")
    protected String waterMark;
    @XmlElement(name = "WaterMarkTopMargin")
    protected int waterMarkTopMargin;
    @XmlElement(name = "WaterMarkLeftMargin")
    protected int waterMarkLeftMargin;
    @XmlElement(name = "WaterMarkTransparency")
    protected int waterMarkTransparency;
    @XmlElement(name = "PointSize")
    protected float pointSize;
    @XmlElement(name = "StackVariationLabels")
    protected boolean stackVariationLabels;
    @XmlElement(name = "ShowAxisLabelInLegend")
    protected boolean showAxisLabelInLegend;
    @XmlElement(name = "LineWidth")
    protected int lineWidth;
    @XmlElement(name = "SplitPercent")
    protected int splitPercent;
    @XmlElement(name = "ShowHigh")
    protected boolean showHigh;
    @XmlElement(name = "ShowLow")
    protected boolean showLow;
    @XmlElement(name = "ShowOpen")
    protected boolean showOpen;
    @XmlElement(name = "ShowClose")
    protected boolean showClose;
    @XmlElement(name = "ShowVolume")
    protected boolean showVolume;
    @XmlElement(name = "ShowUpVariation")
    protected boolean showUpVariation;
    @XmlElement(name = "ShowDownVariation")
    protected boolean showDownVariation;
    @XmlElement(name = "ShowLegend")
    protected boolean showLegend;
    @XmlElement(name = "VariationYear")
    protected int variationYear;
    @XmlElement(name = "VolumeDivider")
    protected int volumeDivider;
    @XmlElement(name = "VolumeTextOffset")
    protected int volumeTextOffset;
    @XmlElement(name = "PriceTextOffset")
    protected int priceTextOffset;
    @XmlElement(name = "FrameType", required = true)
    protected ImageFrameType frameType;
    @XmlElement(name = "Projection", required = true)
    protected PredefinedProjection projection;
    @XmlElement(name = "MarginTop")
    protected int marginTop;
    @XmlElement(name = "MarginBottom")
    protected int marginBottom;
    @XmlElement(name = "MarginLeft")
    protected int marginLeft;
    @XmlElement(name = "MarginRight")
    protected int marginRight;
    @XmlElement(name = "FontFamily")
    protected String fontFamily;
    @XmlElement(name = "FontSizeHeader")
    protected int fontSizeHeader;
    @XmlElement(name = "FontSizeFooter")
    protected int fontSizeFooter;
    @XmlElement(name = "Height")
    protected double height;
    @XmlElement(name = "Width")
    protected double width;
    @XmlElement(name = "ZoomPercent")
    protected int zoomPercent;
    @XmlElement(name = "LegendBox")
    protected boolean legendBox;
    @XmlElement(name = "ColorLegendBackground")
    protected String colorLegendBackground;
    @XmlElement(name = "ColorLegendBorder")
    protected String colorLegendBorder;
    @XmlElement(name = "LegendVerticalPosition")
    protected int legendVerticalPosition;
    @XmlElement(name = "LegendHorizontalPosition")
    protected int legendHorizontalPosition;
    @XmlElement(name = "Reload")
    protected boolean reload;
    @XmlElement(name = "ShowPriceChartLabels")
    protected boolean showPriceChartLabels;
    @XmlElement(name = "TickPrecision", required = true)
    protected TickPeriod tickPrecision;
    @XmlElement(name = "TickPeriods")
    protected int tickPeriods;
    @XmlElement(name = "WaterMarkHorizontalAlign", required = true)
    protected HorzAlign waterMarkHorizontalAlign;
    @XmlElement(name = "LightScheme", required = true)
    protected PredefinedLightModel lightScheme;
    @XmlElement(name = "FontSizeLegend")
    protected int fontSizeLegend;
    @XmlElement(name = "FontSizeAxes")
    protected int fontSizeAxes;
    @XmlElement(name = "FontSizeTitle")
    protected int fontSizeTitle;
    @XmlElement(name = "DaysForHourDisplay")
    protected int daysForHourDisplay;
    @XmlElement(name = "DaysForDayDisplay")
    protected int daysForDayDisplay;
    @XmlElement(name = "DaysForWeekDisplay")
    protected int daysForWeekDisplay;
    @XmlElement(name = "DaysForBiWeeklyDisplay")
    protected int daysForBiWeeklyDisplay;
    @XmlElement(name = "DaysForMonthDisplay")
    protected int daysForMonthDisplay;
    @XmlElement(name = "DaysForQuarterDisplay")
    protected int daysForQuarterDisplay;
    @XmlElement(name = "DaysForSemiAnnualDisplay")
    protected int daysForSemiAnnualDisplay;
    @XmlElement(name = "DaysForAnnualDisplay")
    protected int daysForAnnualDisplay;
    @XmlElement(name = "DaysForBiAnnualDisplay")
    protected int daysForBiAnnualDisplay;
    @XmlElement(name = "DaysForPentaAnnualDisplay")
    protected int daysForPentaAnnualDisplay;

    /**
     * Gets the value of the secure property.
     * 
     */
    public boolean isSecure() {
        return secure;
    }

    /**
     * Sets the value of the secure property.
     * 
     */
    public void setSecure(boolean value) {
        this.secure = value;
    }

    /**
     * Gets the value of the textTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextTitle() {
        return textTitle;
    }

    /**
     * Sets the value of the textTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextTitle(String value) {
        this.textTitle = value;
    }

    /**
     * Gets the value of the textHeader property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextHeader() {
        return textHeader;
    }

    /**
     * Sets the value of the textHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextHeader(String value) {
        this.textHeader = value;
    }

    /**
     * Gets the value of the textFooter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextFooter() {
        return textFooter;
    }

    /**
     * Sets the value of the textFooter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextFooter(String value) {
        this.textFooter = value;
    }

    /**
     * Gets the value of the textPriceLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextPriceLine() {
        return textPriceLine;
    }

    /**
     * Sets the value of the textPriceLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextPriceLine(String value) {
        this.textPriceLine = value;
    }

    /**
     * Gets the value of the textVolumeBar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextVolumeBar() {
        return textVolumeBar;
    }

    /**
     * Sets the value of the textVolumeBar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextVolumeBar(String value) {
        this.textVolumeBar = value;
    }

    /**
     * Gets the value of the textHighest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextHighest() {
        return textHighest;
    }

    /**
     * Sets the value of the textHighest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextHighest(String value) {
        this.textHighest = value;
    }

    /**
     * Gets the value of the textLowest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextLowest() {
        return textLowest;
    }

    /**
     * Sets the value of the textLowest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextLowest(String value) {
        this.textLowest = value;
    }

    /**
     * Gets the value of the textOpen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextOpen() {
        return textOpen;
    }

    /**
     * Sets the value of the textOpen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextOpen(String value) {
        this.textOpen = value;
    }

    /**
     * Gets the value of the textClose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextClose() {
        return textClose;
    }

    /**
     * Sets the value of the textClose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextClose(String value) {
        this.textClose = value;
    }

    /**
     * Gets the value of the textUp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextUp() {
        return textUp;
    }

    /**
     * Sets the value of the textUp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextUp(String value) {
        this.textUp = value;
    }

    /**
     * Gets the value of the textDown property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextDown() {
        return textDown;
    }

    /**
     * Sets the value of the textDown property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextDown(String value) {
        this.textDown = value;
    }

    /**
     * Gets the value of the colorBackground property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorBackground() {
        return colorBackground;
    }

    /**
     * Sets the value of the colorBackground property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorBackground(String value) {
        this.colorBackground = value;
    }

    /**
     * Gets the value of the colorBackWall property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorBackWall() {
        return colorBackWall;
    }

    /**
     * Sets the value of the colorBackWall property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorBackWall(String value) {
        this.colorBackWall = value;
    }

    /**
     * Gets the value of the colorVolumeBackWall property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorVolumeBackWall() {
        return colorVolumeBackWall;
    }

    /**
     * Sets the value of the colorVolumeBackWall property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorVolumeBackWall(String value) {
        this.colorVolumeBackWall = value;
    }

    /**
     * Gets the value of the showVolumeBackWall property.
     * 
     */
    public boolean isShowVolumeBackWall() {
        return showVolumeBackWall;
    }

    /**
     * Sets the value of the showVolumeBackWall property.
     * 
     */
    public void setShowVolumeBackWall(boolean value) {
        this.showVolumeBackWall = value;
    }

    /**
     * Gets the value of the colorHighlight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorHighlight() {
        return colorHighlight;
    }

    /**
     * Sets the value of the colorHighlight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorHighlight(String value) {
        this.colorHighlight = value;
    }

    /**
     * Gets the value of the colorPriceLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorPriceLine() {
        return colorPriceLine;
    }

    /**
     * Sets the value of the colorPriceLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorPriceLine(String value) {
        this.colorPriceLine = value;
    }

    /**
     * Gets the value of the colorVolumeBar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorVolumeBar() {
        return colorVolumeBar;
    }

    /**
     * Sets the value of the colorVolumeBar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorVolumeBar(String value) {
        this.colorVolumeBar = value;
    }

    /**
     * Gets the value of the colorVolumeBarFill property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorVolumeBarFill() {
        return colorVolumeBarFill;
    }

    /**
     * Sets the value of the colorVolumeBarFill property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorVolumeBarFill(String value) {
        this.colorVolumeBarFill = value;
    }

    /**
     * Gets the value of the colorHigh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorHigh() {
        return colorHigh;
    }

    /**
     * Sets the value of the colorHigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorHigh(String value) {
        this.colorHigh = value;
    }

    /**
     * Gets the value of the colorStickUp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorStickUp() {
        return colorStickUp;
    }

    /**
     * Sets the value of the colorStickUp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorStickUp(String value) {
        this.colorStickUp = value;
    }

    /**
     * Gets the value of the colorStickLow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorStickLow() {
        return colorStickLow;
    }

    /**
     * Sets the value of the colorStickLow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorStickLow(String value) {
        this.colorStickLow = value;
    }

    /**
     * Gets the value of the colorConstant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorConstant() {
        return colorConstant;
    }

    /**
     * Sets the value of the colorConstant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorConstant(String value) {
        this.colorConstant = value;
    }

    /**
     * Gets the value of the colorLow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorLow() {
        return colorLow;
    }

    /**
     * Sets the value of the colorLow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorLow(String value) {
        this.colorLow = value;
    }

    /**
     * Gets the value of the colorPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorPoint() {
        return colorPoint;
    }

    /**
     * Sets the value of the colorPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorPoint(String value) {
        this.colorPoint = value;
    }

    /**
     * Gets the value of the colorTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorTitle() {
        return colorTitle;
    }

    /**
     * Sets the value of the colorTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorTitle(String value) {
        this.colorTitle = value;
    }

    /**
     * Gets the value of the colorFooter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorFooter() {
        return colorFooter;
    }

    /**
     * Sets the value of the colorFooter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorFooter(String value) {
        this.colorFooter = value;
    }

    /**
     * Gets the value of the colorHeader property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorHeader() {
        return colorHeader;
    }

    /**
     * Sets the value of the colorHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorHeader(String value) {
        this.colorHeader = value;
    }

    /**
     * Gets the value of the colorAxis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorAxis() {
        return colorAxis;
    }

    /**
     * Sets the value of the colorAxis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorAxis(String value) {
        this.colorAxis = value;
    }

    /**
     * Gets the value of the colorGrid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorGrid() {
        return colorGrid;
    }

    /**
     * Sets the value of the colorGrid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorGrid(String value) {
        this.colorGrid = value;
    }

    /**
     * Gets the value of the colorFonts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorFonts() {
        return colorFonts;
    }

    /**
     * Sets the value of the colorFonts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorFonts(String value) {
        this.colorFonts = value;
    }

    /**
     * Gets the value of the colorStripe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorStripe() {
        return colorStripe;
    }

    /**
     * Sets the value of the colorStripe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorStripe(String value) {
        this.colorStripe = value;
    }

    /**
     * Gets the value of the colorOpen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorOpen() {
        return colorOpen;
    }

    /**
     * Sets the value of the colorOpen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorOpen(String value) {
        this.colorOpen = value;
    }

    /**
     * Gets the value of the colorClose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorClose() {
        return colorClose;
    }

    /**
     * Sets the value of the colorClose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorClose(String value) {
        this.colorClose = value;
    }

    /**
     * Gets the value of the colorVerticalGrid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorVerticalGrid() {
        return colorVerticalGrid;
    }

    /**
     * Sets the value of the colorVerticalGrid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorVerticalGrid(String value) {
        this.colorVerticalGrid = value;
    }

    /**
     * Gets the value of the colorHorizontalGrid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorHorizontalGrid() {
        return colorHorizontalGrid;
    }

    /**
     * Sets the value of the colorHorizontalGrid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorHorizontalGrid(String value) {
        this.colorHorizontalGrid = value;
    }

    /**
     * Gets the value of the colorUp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorUp() {
        return colorUp;
    }

    /**
     * Sets the value of the colorUp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorUp(String value) {
        this.colorUp = value;
    }

    /**
     * Gets the value of the colorDown property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorDown() {
        return colorDown;
    }

    /**
     * Sets the value of the colorDown property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorDown(String value) {
        this.colorDown = value;
    }

    /**
     * Gets the value of the colorHighLowLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorHighLowLine() {
        return colorHighLowLine;
    }

    /**
     * Sets the value of the colorHighLowLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorHighLowLine(String value) {
        this.colorHighLowLine = value;
    }

    /**
     * Gets the value of the colorCollection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorCollection() {
        return colorCollection;
    }

    /**
     * Sets the value of the colorCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorCollection(String value) {
        this.colorCollection = value;
    }

    /**
     * Gets the value of the gridHorizontalStyle property.
     * 
     * @return
     *     possible object is
     *     {@link LinePattern }
     *     
     */
    public LinePattern getGridHorizontalStyle() {
        return gridHorizontalStyle;
    }

    /**
     * Sets the value of the gridHorizontalStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinePattern }
     *     
     */
    public void setGridHorizontalStyle(LinePattern value) {
        this.gridHorizontalStyle = value;
    }

    /**
     * Gets the value of the gridVerticalStyle property.
     * 
     * @return
     *     possible object is
     *     {@link LinePattern }
     *     
     */
    public LinePattern getGridVerticalStyle() {
        return gridVerticalStyle;
    }

    /**
     * Sets the value of the gridVerticalStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinePattern }
     *     
     */
    public void setGridVerticalStyle(LinePattern value) {
        this.gridVerticalStyle = value;
    }

    /**
     * Gets the value of the gridHorizontalWidth property.
     * 
     */
    public int getGridHorizontalWidth() {
        return gridHorizontalWidth;
    }

    /**
     * Sets the value of the gridHorizontalWidth property.
     * 
     */
    public void setGridHorizontalWidth(int value) {
        this.gridHorizontalWidth = value;
    }

    /**
     * Gets the value of the gridVerticalWidth property.
     * 
     */
    public int getGridVerticalWidth() {
        return gridVerticalWidth;
    }

    /**
     * Sets the value of the gridVerticalWidth property.
     * 
     */
    public void setGridVerticalWidth(int value) {
        this.gridVerticalWidth = value;
    }

    /**
     * Gets the value of the colorFrame property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorFrame() {
        return colorFrame;
    }

    /**
     * Sets the value of the colorFrame property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorFrame(String value) {
        this.colorFrame = value;
    }

    /**
     * Gets the value of the frameBorder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrameBorder() {
        return frameBorder;
    }

    /**
     * Sets the value of the frameBorder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrameBorder(String value) {
        this.frameBorder = value;
    }

    /**
     * Gets the value of the formatPriceLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormatPriceLine() {
        return formatPriceLine;
    }

    /**
     * Sets the value of the formatPriceLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormatPriceLine(String value) {
        this.formatPriceLine = value;
    }

    /**
     * Gets the value of the formatVolume property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormatVolume() {
        return formatVolume;
    }

    /**
     * Sets the value of the formatVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormatVolume(String value) {
        this.formatVolume = value;
    }

    /**
     * Gets the value of the formatDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormatDate() {
        return formatDate;
    }

    /**
     * Sets the value of the formatDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormatDate(String value) {
        this.formatDate = value;
    }

    /**
     * Gets the value of the gradeBackground property.
     * 
     */
    public boolean isGradeBackground() {
        return gradeBackground;
    }

    /**
     * Sets the value of the gradeBackground property.
     * 
     */
    public void setGradeBackground(boolean value) {
        this.gradeBackground = value;
    }

    /**
     * Gets the value of the gradeBackwall property.
     * 
     */
    public boolean isGradeBackwall() {
        return gradeBackwall;
    }

    /**
     * Sets the value of the gradeBackwall property.
     * 
     */
    public void setGradeBackwall(boolean value) {
        this.gradeBackwall = value;
    }

    /**
     * Gets the value of the waterMark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaterMark() {
        return waterMark;
    }

    /**
     * Sets the value of the waterMark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaterMark(String value) {
        this.waterMark = value;
    }

    /**
     * Gets the value of the waterMarkTopMargin property.
     * 
     */
    public int getWaterMarkTopMargin() {
        return waterMarkTopMargin;
    }

    /**
     * Sets the value of the waterMarkTopMargin property.
     * 
     */
    public void setWaterMarkTopMargin(int value) {
        this.waterMarkTopMargin = value;
    }

    /**
     * Gets the value of the waterMarkLeftMargin property.
     * 
     */
    public int getWaterMarkLeftMargin() {
        return waterMarkLeftMargin;
    }

    /**
     * Sets the value of the waterMarkLeftMargin property.
     * 
     */
    public void setWaterMarkLeftMargin(int value) {
        this.waterMarkLeftMargin = value;
    }

    /**
     * Gets the value of the waterMarkTransparency property.
     * 
     */
    public int getWaterMarkTransparency() {
        return waterMarkTransparency;
    }

    /**
     * Sets the value of the waterMarkTransparency property.
     * 
     */
    public void setWaterMarkTransparency(int value) {
        this.waterMarkTransparency = value;
    }

    /**
     * Gets the value of the pointSize property.
     * 
     */
    public float getPointSize() {
        return pointSize;
    }

    /**
     * Sets the value of the pointSize property.
     * 
     */
    public void setPointSize(float value) {
        this.pointSize = value;
    }

    /**
     * Gets the value of the stackVariationLabels property.
     * 
     */
    public boolean isStackVariationLabels() {
        return stackVariationLabels;
    }

    /**
     * Sets the value of the stackVariationLabels property.
     * 
     */
    public void setStackVariationLabels(boolean value) {
        this.stackVariationLabels = value;
    }

    /**
     * Gets the value of the showAxisLabelInLegend property.
     * 
     */
    public boolean isShowAxisLabelInLegend() {
        return showAxisLabelInLegend;
    }

    /**
     * Sets the value of the showAxisLabelInLegend property.
     * 
     */
    public void setShowAxisLabelInLegend(boolean value) {
        this.showAxisLabelInLegend = value;
    }

    /**
     * Gets the value of the lineWidth property.
     * 
     */
    public int getLineWidth() {
        return lineWidth;
    }

    /**
     * Sets the value of the lineWidth property.
     * 
     */
    public void setLineWidth(int value) {
        this.lineWidth = value;
    }

    /**
     * Gets the value of the splitPercent property.
     * 
     */
    public int getSplitPercent() {
        return splitPercent;
    }

    /**
     * Sets the value of the splitPercent property.
     * 
     */
    public void setSplitPercent(int value) {
        this.splitPercent = value;
    }

    /**
     * Gets the value of the showHigh property.
     * 
     */
    public boolean isShowHigh() {
        return showHigh;
    }

    /**
     * Sets the value of the showHigh property.
     * 
     */
    public void setShowHigh(boolean value) {
        this.showHigh = value;
    }

    /**
     * Gets the value of the showLow property.
     * 
     */
    public boolean isShowLow() {
        return showLow;
    }

    /**
     * Sets the value of the showLow property.
     * 
     */
    public void setShowLow(boolean value) {
        this.showLow = value;
    }

    /**
     * Gets the value of the showOpen property.
     * 
     */
    public boolean isShowOpen() {
        return showOpen;
    }

    /**
     * Sets the value of the showOpen property.
     * 
     */
    public void setShowOpen(boolean value) {
        this.showOpen = value;
    }

    /**
     * Gets the value of the showClose property.
     * 
     */
    public boolean isShowClose() {
        return showClose;
    }

    /**
     * Sets the value of the showClose property.
     * 
     */
    public void setShowClose(boolean value) {
        this.showClose = value;
    }

    /**
     * Gets the value of the showVolume property.
     * 
     */
    public boolean isShowVolume() {
        return showVolume;
    }

    /**
     * Sets the value of the showVolume property.
     * 
     */
    public void setShowVolume(boolean value) {
        this.showVolume = value;
    }

    /**
     * Gets the value of the showUpVariation property.
     * 
     */
    public boolean isShowUpVariation() {
        return showUpVariation;
    }

    /**
     * Sets the value of the showUpVariation property.
     * 
     */
    public void setShowUpVariation(boolean value) {
        this.showUpVariation = value;
    }

    /**
     * Gets the value of the showDownVariation property.
     * 
     */
    public boolean isShowDownVariation() {
        return showDownVariation;
    }

    /**
     * Sets the value of the showDownVariation property.
     * 
     */
    public void setShowDownVariation(boolean value) {
        this.showDownVariation = value;
    }

    /**
     * Gets the value of the showLegend property.
     * 
     */
    public boolean isShowLegend() {
        return showLegend;
    }

    /**
     * Sets the value of the showLegend property.
     * 
     */
    public void setShowLegend(boolean value) {
        this.showLegend = value;
    }

    /**
     * Gets the value of the variationYear property.
     * 
     */
    public int getVariationYear() {
        return variationYear;
    }

    /**
     * Sets the value of the variationYear property.
     * 
     */
    public void setVariationYear(int value) {
        this.variationYear = value;
    }

    /**
     * Gets the value of the volumeDivider property.
     * 
     */
    public int getVolumeDivider() {
        return volumeDivider;
    }

    /**
     * Sets the value of the volumeDivider property.
     * 
     */
    public void setVolumeDivider(int value) {
        this.volumeDivider = value;
    }

    /**
     * Gets the value of the volumeTextOffset property.
     * 
     */
    public int getVolumeTextOffset() {
        return volumeTextOffset;
    }

    /**
     * Sets the value of the volumeTextOffset property.
     * 
     */
    public void setVolumeTextOffset(int value) {
        this.volumeTextOffset = value;
    }

    /**
     * Gets the value of the priceTextOffset property.
     * 
     */
    public int getPriceTextOffset() {
        return priceTextOffset;
    }

    /**
     * Sets the value of the priceTextOffset property.
     * 
     */
    public void setPriceTextOffset(int value) {
        this.priceTextOffset = value;
    }

    /**
     * Gets the value of the frameType property.
     * 
     * @return
     *     possible object is
     *     {@link ImageFrameType }
     *     
     */
    public ImageFrameType getFrameType() {
        return frameType;
    }

    /**
     * Sets the value of the frameType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageFrameType }
     *     
     */
    public void setFrameType(ImageFrameType value) {
        this.frameType = value;
    }

    /**
     * Gets the value of the projection property.
     * 
     * @return
     *     possible object is
     *     {@link PredefinedProjection }
     *     
     */
    public PredefinedProjection getProjection() {
        return projection;
    }

    /**
     * Sets the value of the projection property.
     * 
     * @param value
     *     allowed object is
     *     {@link PredefinedProjection }
     *     
     */
    public void setProjection(PredefinedProjection value) {
        this.projection = value;
    }

    /**
     * Gets the value of the marginTop property.
     * 
     */
    public int getMarginTop() {
        return marginTop;
    }

    /**
     * Sets the value of the marginTop property.
     * 
     */
    public void setMarginTop(int value) {
        this.marginTop = value;
    }

    /**
     * Gets the value of the marginBottom property.
     * 
     */
    public int getMarginBottom() {
        return marginBottom;
    }

    /**
     * Sets the value of the marginBottom property.
     * 
     */
    public void setMarginBottom(int value) {
        this.marginBottom = value;
    }

    /**
     * Gets the value of the marginLeft property.
     * 
     */
    public int getMarginLeft() {
        return marginLeft;
    }

    /**
     * Sets the value of the marginLeft property.
     * 
     */
    public void setMarginLeft(int value) {
        this.marginLeft = value;
    }

    /**
     * Gets the value of the marginRight property.
     * 
     */
    public int getMarginRight() {
        return marginRight;
    }

    /**
     * Sets the value of the marginRight property.
     * 
     */
    public void setMarginRight(int value) {
        this.marginRight = value;
    }

    /**
     * Gets the value of the fontFamily property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFontFamily() {
        return fontFamily;
    }

    /**
     * Sets the value of the fontFamily property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFontFamily(String value) {
        this.fontFamily = value;
    }

    /**
     * Gets the value of the fontSizeHeader property.
     * 
     */
    public int getFontSizeHeader() {
        return fontSizeHeader;
    }

    /**
     * Sets the value of the fontSizeHeader property.
     * 
     */
    public void setFontSizeHeader(int value) {
        this.fontSizeHeader = value;
    }

    /**
     * Gets the value of the fontSizeFooter property.
     * 
     */
    public int getFontSizeFooter() {
        return fontSizeFooter;
    }

    /**
     * Sets the value of the fontSizeFooter property.
     * 
     */
    public void setFontSizeFooter(int value) {
        this.fontSizeFooter = value;
    }

    /**
     * Gets the value of the height property.
     * 
     */
    public double getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     */
    public void setHeight(double value) {
        this.height = value;
    }

    /**
     * Gets the value of the width property.
     * 
     */
    public double getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     */
    public void setWidth(double value) {
        this.width = value;
    }

    /**
     * Gets the value of the zoomPercent property.
     * 
     */
    public int getZoomPercent() {
        return zoomPercent;
    }

    /**
     * Sets the value of the zoomPercent property.
     * 
     */
    public void setZoomPercent(int value) {
        this.zoomPercent = value;
    }

    /**
     * Gets the value of the legendBox property.
     * 
     */
    public boolean isLegendBox() {
        return legendBox;
    }

    /**
     * Sets the value of the legendBox property.
     * 
     */
    public void setLegendBox(boolean value) {
        this.legendBox = value;
    }

    /**
     * Gets the value of the colorLegendBackground property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorLegendBackground() {
        return colorLegendBackground;
    }

    /**
     * Sets the value of the colorLegendBackground property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorLegendBackground(String value) {
        this.colorLegendBackground = value;
    }

    /**
     * Gets the value of the colorLegendBorder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorLegendBorder() {
        return colorLegendBorder;
    }

    /**
     * Sets the value of the colorLegendBorder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorLegendBorder(String value) {
        this.colorLegendBorder = value;
    }

    /**
     * Gets the value of the legendVerticalPosition property.
     * 
     */
    public int getLegendVerticalPosition() {
        return legendVerticalPosition;
    }

    /**
     * Sets the value of the legendVerticalPosition property.
     * 
     */
    public void setLegendVerticalPosition(int value) {
        this.legendVerticalPosition = value;
    }

    /**
     * Gets the value of the legendHorizontalPosition property.
     * 
     */
    public int getLegendHorizontalPosition() {
        return legendHorizontalPosition;
    }

    /**
     * Sets the value of the legendHorizontalPosition property.
     * 
     */
    public void setLegendHorizontalPosition(int value) {
        this.legendHorizontalPosition = value;
    }

    /**
     * Gets the value of the reload property.
     * 
     */
    public boolean isReload() {
        return reload;
    }

    /**
     * Sets the value of the reload property.
     * 
     */
    public void setReload(boolean value) {
        this.reload = value;
    }

    /**
     * Gets the value of the showPriceChartLabels property.
     * 
     */
    public boolean isShowPriceChartLabels() {
        return showPriceChartLabels;
    }

    /**
     * Sets the value of the showPriceChartLabels property.
     * 
     */
    public void setShowPriceChartLabels(boolean value) {
        this.showPriceChartLabels = value;
    }

    /**
     * Gets the value of the tickPrecision property.
     * 
     * @return
     *     possible object is
     *     {@link TickPeriod }
     *     
     */
    public TickPeriod getTickPrecision() {
        return tickPrecision;
    }

    /**
     * Sets the value of the tickPrecision property.
     * 
     * @param value
     *     allowed object is
     *     {@link TickPeriod }
     *     
     */
    public void setTickPrecision(TickPeriod value) {
        this.tickPrecision = value;
    }

    /**
     * Gets the value of the tickPeriods property.
     * 
     */
    public int getTickPeriods() {
        return tickPeriods;
    }

    /**
     * Sets the value of the tickPeriods property.
     * 
     */
    public void setTickPeriods(int value) {
        this.tickPeriods = value;
    }

    /**
     * Gets the value of the waterMarkHorizontalAlign property.
     * 
     * @return
     *     possible object is
     *     {@link HorzAlign }
     *     
     */
    public HorzAlign getWaterMarkHorizontalAlign() {
        return waterMarkHorizontalAlign;
    }

    /**
     * Sets the value of the waterMarkHorizontalAlign property.
     * 
     * @param value
     *     allowed object is
     *     {@link HorzAlign }
     *     
     */
    public void setWaterMarkHorizontalAlign(HorzAlign value) {
        this.waterMarkHorizontalAlign = value;
    }

    /**
     * Gets the value of the lightScheme property.
     * 
     * @return
     *     possible object is
     *     {@link PredefinedLightModel }
     *     
     */
    public PredefinedLightModel getLightScheme() {
        return lightScheme;
    }

    /**
     * Sets the value of the lightScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link PredefinedLightModel }
     *     
     */
    public void setLightScheme(PredefinedLightModel value) {
        this.lightScheme = value;
    }

    /**
     * Gets the value of the fontSizeLegend property.
     * 
     */
    public int getFontSizeLegend() {
        return fontSizeLegend;
    }

    /**
     * Sets the value of the fontSizeLegend property.
     * 
     */
    public void setFontSizeLegend(int value) {
        this.fontSizeLegend = value;
    }

    /**
     * Gets the value of the fontSizeAxes property.
     * 
     */
    public int getFontSizeAxes() {
        return fontSizeAxes;
    }

    /**
     * Sets the value of the fontSizeAxes property.
     * 
     */
    public void setFontSizeAxes(int value) {
        this.fontSizeAxes = value;
    }

    /**
     * Gets the value of the fontSizeTitle property.
     * 
     */
    public int getFontSizeTitle() {
        return fontSizeTitle;
    }

    /**
     * Sets the value of the fontSizeTitle property.
     * 
     */
    public void setFontSizeTitle(int value) {
        this.fontSizeTitle = value;
    }

    /**
     * Gets the value of the daysForHourDisplay property.
     * 
     */
    public int getDaysForHourDisplay() {
        return daysForHourDisplay;
    }

    /**
     * Sets the value of the daysForHourDisplay property.
     * 
     */
    public void setDaysForHourDisplay(int value) {
        this.daysForHourDisplay = value;
    }

    /**
     * Gets the value of the daysForDayDisplay property.
     * 
     */
    public int getDaysForDayDisplay() {
        return daysForDayDisplay;
    }

    /**
     * Sets the value of the daysForDayDisplay property.
     * 
     */
    public void setDaysForDayDisplay(int value) {
        this.daysForDayDisplay = value;
    }

    /**
     * Gets the value of the daysForWeekDisplay property.
     * 
     */
    public int getDaysForWeekDisplay() {
        return daysForWeekDisplay;
    }

    /**
     * Sets the value of the daysForWeekDisplay property.
     * 
     */
    public void setDaysForWeekDisplay(int value) {
        this.daysForWeekDisplay = value;
    }

    /**
     * Gets the value of the daysForBiWeeklyDisplay property.
     * 
     */
    public int getDaysForBiWeeklyDisplay() {
        return daysForBiWeeklyDisplay;
    }

    /**
     * Sets the value of the daysForBiWeeklyDisplay property.
     * 
     */
    public void setDaysForBiWeeklyDisplay(int value) {
        this.daysForBiWeeklyDisplay = value;
    }

    /**
     * Gets the value of the daysForMonthDisplay property.
     * 
     */
    public int getDaysForMonthDisplay() {
        return daysForMonthDisplay;
    }

    /**
     * Sets the value of the daysForMonthDisplay property.
     * 
     */
    public void setDaysForMonthDisplay(int value) {
        this.daysForMonthDisplay = value;
    }

    /**
     * Gets the value of the daysForQuarterDisplay property.
     * 
     */
    public int getDaysForQuarterDisplay() {
        return daysForQuarterDisplay;
    }

    /**
     * Sets the value of the daysForQuarterDisplay property.
     * 
     */
    public void setDaysForQuarterDisplay(int value) {
        this.daysForQuarterDisplay = value;
    }

    /**
     * Gets the value of the daysForSemiAnnualDisplay property.
     * 
     */
    public int getDaysForSemiAnnualDisplay() {
        return daysForSemiAnnualDisplay;
    }

    /**
     * Sets the value of the daysForSemiAnnualDisplay property.
     * 
     */
    public void setDaysForSemiAnnualDisplay(int value) {
        this.daysForSemiAnnualDisplay = value;
    }

    /**
     * Gets the value of the daysForAnnualDisplay property.
     * 
     */
    public int getDaysForAnnualDisplay() {
        return daysForAnnualDisplay;
    }

    /**
     * Sets the value of the daysForAnnualDisplay property.
     * 
     */
    public void setDaysForAnnualDisplay(int value) {
        this.daysForAnnualDisplay = value;
    }

    /**
     * Gets the value of the daysForBiAnnualDisplay property.
     * 
     */
    public int getDaysForBiAnnualDisplay() {
        return daysForBiAnnualDisplay;
    }

    /**
     * Sets the value of the daysForBiAnnualDisplay property.
     * 
     */
    public void setDaysForBiAnnualDisplay(int value) {
        this.daysForBiAnnualDisplay = value;
    }

    /**
     * Gets the value of the daysForPentaAnnualDisplay property.
     * 
     */
    public int getDaysForPentaAnnualDisplay() {
        return daysForPentaAnnualDisplay;
    }

    /**
     * Sets the value of the daysForPentaAnnualDisplay property.
     * 
     */
    public void setDaysForPentaAnnualDisplay(int value) {
        this.daysForPentaAnnualDisplay = value;
    }

}
