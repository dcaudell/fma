
package com.xtrafe.server.ejb.xignite;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.xtrafe.server.ejb.xignite package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ArrayOfTicks_QNAME = new QName("http://www.xignite.com/services/", "ArrayOfTicks");
    private final static QName _IntradayChart_QNAME = new QName("http://www.xignite.com/services/", "IntradayChart");
    private final static QName _BooleanResult_QNAME = new QName("http://www.xignite.com/services/", "BooleanResult");
    private final static QName _DetailedBook_QNAME = new QName("http://www.xignite.com/services/", "DetailedBook");
    private final static QName _Header_QNAME = new QName("http://www.xignite.com/services/", "Header");
    private final static QName _Ticks_QNAME = new QName("http://www.xignite.com/services/", "Ticks");
    private final static QName _ArrayOfRealTimeQuote_QNAME = new QName("http://www.xignite.com/services/", "ArrayOfRealTimeQuote");
    private final static QName _ExchangeTime_QNAME = new QName("http://www.xignite.com/services/", "ExchangeTime");
    private final static QName _ArrayOfSearchResult_QNAME = new QName("http://www.xignite.com/services/", "ArrayOfSearchResult");
    private final static QName _ArrayOfTop_QNAME = new QName("http://www.xignite.com/services/", "ArrayOfTop");
    private final static QName _RealTimeQuote_QNAME = new QName("http://www.xignite.com/services/", "RealTimeQuote");
    private final static QName _ArrayOfExtendedRealTimeQuote_QNAME = new QName("http://www.xignite.com/services/", "ArrayOfExtendedRealTimeQuote");
    private final static QName _Book_QNAME = new QName("http://www.xignite.com/services/", "Book");
    private final static QName _Top_QNAME = new QName("http://www.xignite.com/services/", "Top");
    private final static QName _ChartDesign_QNAME = new QName("http://www.xignite.com/services/", "ChartDesign");
    private final static QName _TickerTape_QNAME = new QName("http://www.xignite.com/services/", "TickerTape");
    private final static QName _ExtendedRealTimeQuote_QNAME = new QName("http://www.xignite.com/services/", "ExtendedRealTimeQuote");
    private final static QName _SingleTick_QNAME = new QName("http://www.xignite.com/services/", "SingleTick");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.xtrafe.server.ejb.xignite
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetExtendedRealQuotesResponse }
     * 
     */
    public GetExtendedRealQuotesResponse createGetExtendedRealQuotesResponse() {
        return new GetExtendedRealQuotesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfExtendedRealTimeQuote }
     * 
     */
    public ArrayOfExtendedRealTimeQuote createArrayOfExtendedRealTimeQuote() {
        return new ArrayOfExtendedRealTimeQuote();
    }

    /**
     * Create an instance of {@link GetTicksResponse }
     * 
     */
    public GetTicksResponse createGetTicksResponse() {
        return new GetTicksResponse();
    }

    /**
     * Create an instance of {@link Ticks }
     * 
     */
    public Ticks createTicks() {
        return new Ticks();
    }

    /**
     * Create an instance of {@link GetTicks }
     * 
     */
    public GetTicks createGetTicks() {
        return new GetTicks();
    }

    /**
     * Create an instance of {@link IsTraded }
     * 
     */
    public IsTraded createIsTraded() {
        return new IsTraded();
    }

    /**
     * Create an instance of {@link TickerTape }
     * 
     */
    public TickerTape createTickerTape() {
        return new TickerTape();
    }

    /**
     * Create an instance of {@link GetRealTop }
     * 
     */
    public GetRealTop createGetRealTop() {
        return new GetRealTop();
    }

    /**
     * Create an instance of {@link ChartDesign }
     * 
     */
    public ChartDesign createChartDesign() {
        return new ChartDesign();
    }

    /**
     * Create an instance of {@link GetBookDetails }
     * 
     */
    public GetBookDetails createGetBookDetails() {
        return new GetBookDetails();
    }

    /**
     * Create an instance of {@link SearchByMarketCapResponse }
     * 
     */
    public SearchByMarketCapResponse createSearchByMarketCapResponse() {
        return new SearchByMarketCapResponse();
    }

    /**
     * Create an instance of {@link ArrayOfSearchResult }
     * 
     */
    public ArrayOfSearchResult createArrayOfSearchResult() {
        return new ArrayOfSearchResult();
    }

    /**
     * Create an instance of {@link GetRealChartResponse }
     * 
     */
    public GetRealChartResponse createGetRealChartResponse() {
        return new GetRealChartResponse();
    }

    /**
     * Create an instance of {@link IntradayChart }
     * 
     */
    public IntradayChart createIntradayChart() {
        return new IntradayChart();
    }

    /**
     * Create an instance of {@link GetHistoricalTicksAsOfDate }
     * 
     */
    public GetHistoricalTicksAsOfDate createGetHistoricalTicksAsOfDate() {
        return new GetHistoricalTicksAsOfDate();
    }

    /**
     * Create an instance of {@link GetRealQuotesTicker }
     * 
     */
    public GetRealQuotesTicker createGetRealQuotesTicker() {
        return new GetRealQuotesTicker();
    }

    /**
     * Create an instance of {@link GetExtendedRealQuote }
     * 
     */
    public GetExtendedRealQuote createGetExtendedRealQuote() {
        return new GetExtendedRealQuote();
    }

    /**
     * Create an instance of {@link GetTickResponse }
     * 
     */
    public GetTickResponse createGetTickResponse() {
        return new GetTickResponse();
    }

    /**
     * Create an instance of {@link SingleTick }
     * 
     */
    public SingleTick createSingleTick() {
        return new SingleTick();
    }

    /**
     * Create an instance of {@link GetRealChartCustom }
     * 
     */
    public GetRealChartCustom createGetRealChartCustom() {
        return new GetRealChartCustom();
    }

    /**
     * Create an instance of {@link ExchangeTime }
     * 
     */
    public ExchangeTime createExchangeTime() {
        return new ExchangeTime();
    }

    /**
     * Create an instance of {@link GetBookResponse }
     * 
     */
    public GetBookResponse createGetBookResponse() {
        return new GetBookResponse();
    }

    /**
     * Create an instance of {@link Book }
     * 
     */
    public Book createBook() {
        return new Book();
    }

    /**
     * Create an instance of {@link Top }
     * 
     */
    public Top createTop() {
        return new Top();
    }

    /**
     * Create an instance of {@link GetRealTopMovers }
     * 
     */
    public GetRealTopMovers createGetRealTopMovers() {
        return new GetRealTopMovers();
    }

    /**
     * Create an instance of {@link GetTickCollectionsResponse }
     * 
     */
    public GetTickCollectionsResponse createGetTickCollectionsResponse() {
        return new GetTickCollectionsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfTicks }
     * 
     */
    public ArrayOfTicks createArrayOfTicks() {
        return new ArrayOfTicks();
    }

    /**
     * Create an instance of {@link GetRealTopGainers }
     * 
     */
    public GetRealTopGainers createGetRealTopGainers() {
        return new GetRealTopGainers();
    }

    /**
     * Create an instance of {@link GetRealTopResponse }
     * 
     */
    public GetRealTopResponse createGetRealTopResponse() {
        return new GetRealTopResponse();
    }

    /**
     * Create an instance of {@link ArrayOfTop }
     * 
     */
    public ArrayOfTop createArrayOfTop() {
        return new ArrayOfTop();
    }

    /**
     * Create an instance of {@link ExtendedRealTimeQuote }
     * 
     */
    public ExtendedRealTimeQuote createExtendedRealTimeQuote() {
        return new ExtendedRealTimeQuote();
    }

    /**
     * Create an instance of {@link SearchByMarketCap }
     * 
     */
    public SearchByMarketCap createSearchByMarketCap() {
        return new SearchByMarketCap();
    }

    /**
     * Create an instance of {@link GetRealQuotesResponse }
     * 
     */
    public GetRealQuotesResponse createGetRealQuotesResponse() {
        return new GetRealQuotesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfRealTimeQuote }
     * 
     */
    public ArrayOfRealTimeQuote createArrayOfRealTimeQuote() {
        return new ArrayOfRealTimeQuote();
    }

    /**
     * Create an instance of {@link GetRealChart }
     * 
     */
    public GetRealChart createGetRealChart() {
        return new GetRealChart();
    }

    /**
     * Create an instance of {@link GetRealQuoteByIdentifierResponse }
     * 
     */
    public GetRealQuoteByIdentifierResponse createGetRealQuoteByIdentifierResponse() {
        return new GetRealQuoteByIdentifierResponse();
    }

    /**
     * Create an instance of {@link RealTimeQuote }
     * 
     */
    public RealTimeQuote createRealTimeQuote() {
        return new RealTimeQuote();
    }

    /**
     * Create an instance of {@link GetRealQuoteResponse }
     * 
     */
    public GetRealQuoteResponse createGetRealQuoteResponse() {
        return new GetRealQuoteResponse();
    }

    /**
     * Create an instance of {@link GetHistoricalTicksResponse }
     * 
     */
    public GetHistoricalTicksResponse createGetHistoricalTicksResponse() {
        return new GetHistoricalTicksResponse();
    }

    /**
     * Create an instance of {@link GetRealChartPreset }
     * 
     */
    public GetRealChartPreset createGetRealChartPreset() {
        return new GetRealChartPreset();
    }

    /**
     * Create an instance of {@link GetRealTopLosersResponse }
     * 
     */
    public GetRealTopLosersResponse createGetRealTopLosersResponse() {
        return new GetRealTopLosersResponse();
    }

    /**
     * Create an instance of {@link GetBook }
     * 
     */
    public GetBook createGetBook() {
        return new GetBook();
    }

    /**
     * Create an instance of {@link BooleanResult }
     * 
     */
    public BooleanResult createBooleanResult() {
        return new BooleanResult();
    }

    /**
     * Create an instance of {@link GetTickCollections }
     * 
     */
    public GetTickCollections createGetTickCollections() {
        return new GetTickCollections();
    }

    /**
     * Create an instance of {@link GetRealQuotesTickerResponse }
     * 
     */
    public GetRealQuotesTickerResponse createGetRealQuotesTickerResponse() {
        return new GetRealQuotesTickerResponse();
    }

    /**
     * Create an instance of {@link Header }
     * 
     */
    public Header createHeader() {
        return new Header();
    }

    /**
     * Create an instance of {@link GetRealQuote }
     * 
     */
    public GetRealQuote createGetRealQuote() {
        return new GetRealQuote();
    }

    /**
     * Create an instance of {@link GetRealQuoteByIdentifier }
     * 
     */
    public GetRealQuoteByIdentifier createGetRealQuoteByIdentifier() {
        return new GetRealQuoteByIdentifier();
    }

    /**
     * Create an instance of {@link GetChartDesignResponse }
     * 
     */
    public GetChartDesignResponse createGetChartDesignResponse() {
        return new GetChartDesignResponse();
    }

    /**
     * Create an instance of {@link GetRealTopGainersResponse }
     * 
     */
    public GetRealTopGainersResponse createGetRealTopGainersResponse() {
        return new GetRealTopGainersResponse();
    }

    /**
     * Create an instance of {@link GetHistoricalTicks }
     * 
     */
    public GetHistoricalTicks createGetHistoricalTicks() {
        return new GetHistoricalTicks();
    }

    /**
     * Create an instance of {@link GetExtendedRealQuotes }
     * 
     */
    public GetExtendedRealQuotes createGetExtendedRealQuotes() {
        return new GetExtendedRealQuotes();
    }

    /**
     * Create an instance of {@link GetHistoricalTicksAsOfDateResponse }
     * 
     */
    public GetHistoricalTicksAsOfDateResponse createGetHistoricalTicksAsOfDateResponse() {
        return new GetHistoricalTicksAsOfDateResponse();
    }

    /**
     * Create an instance of {@link GetExchangeTime }
     * 
     */
    public GetExchangeTime createGetExchangeTime() {
        return new GetExchangeTime();
    }

    /**
     * Create an instance of {@link GetRealTopMoversResponse }
     * 
     */
    public GetRealTopMoversResponse createGetRealTopMoversResponse() {
        return new GetRealTopMoversResponse();
    }

    /**
     * Create an instance of {@link GetBookDetailsResponse }
     * 
     */
    public GetBookDetailsResponse createGetBookDetailsResponse() {
        return new GetBookDetailsResponse();
    }

    /**
     * Create an instance of {@link DetailedBook }
     * 
     */
    public DetailedBook createDetailedBook() {
        return new DetailedBook();
    }

    /**
     * Create an instance of {@link GetRealChartPresetResponse }
     * 
     */
    public GetRealChartPresetResponse createGetRealChartPresetResponse() {
        return new GetRealChartPresetResponse();
    }

    /**
     * Create an instance of {@link GetChartDesign }
     * 
     */
    public GetChartDesign createGetChartDesign() {
        return new GetChartDesign();
    }

    /**
     * Create an instance of {@link GetExchangeTimeResponse }
     * 
     */
    public GetExchangeTimeResponse createGetExchangeTimeResponse() {
        return new GetExchangeTimeResponse();
    }

    /**
     * Create an instance of {@link GetRealChartCustomResponse }
     * 
     */
    public GetRealChartCustomResponse createGetRealChartCustomResponse() {
        return new GetRealChartCustomResponse();
    }

    /**
     * Create an instance of {@link IsTradedResponse }
     * 
     */
    public IsTradedResponse createIsTradedResponse() {
        return new IsTradedResponse();
    }

    /**
     * Create an instance of {@link GetRealQuotes }
     * 
     */
    public GetRealQuotes createGetRealQuotes() {
        return new GetRealQuotes();
    }

    /**
     * Create an instance of {@link GetExtendedRealQuoteResponse }
     * 
     */
    public GetExtendedRealQuoteResponse createGetExtendedRealQuoteResponse() {
        return new GetExtendedRealQuoteResponse();
    }

    /**
     * Create an instance of {@link GetTick }
     * 
     */
    public GetTick createGetTick() {
        return new GetTick();
    }

    /**
     * Create an instance of {@link GetRealTopLosers }
     * 
     */
    public GetRealTopLosers createGetRealTopLosers() {
        return new GetRealTopLosers();
    }

    /**
     * Create an instance of {@link Order }
     * 
     */
    public Order createOrder() {
        return new Order();
    }

    /**
     * Create an instance of {@link ArrayOfOrderSummary }
     * 
     */
    public ArrayOfOrderSummary createArrayOfOrderSummary() {
        return new ArrayOfOrderSummary();
    }

    /**
     * Create an instance of {@link Common }
     * 
     */
    public Common createCommon() {
        return new Common();
    }

    /**
     * Create an instance of {@link StockChart }
     * 
     */
    public StockChart createStockChart() {
        return new StockChart();
    }

    /**
     * Create an instance of {@link SearchResult }
     * 
     */
    public SearchResult createSearchResult() {
        return new SearchResult();
    }

    /**
     * Create an instance of {@link OrderSummary }
     * 
     */
    public OrderSummary createOrderSummary() {
        return new OrderSummary();
    }

    /**
     * Create an instance of {@link ArrayOfOrder }
     * 
     */
    public ArrayOfOrder createArrayOfOrder() {
        return new ArrayOfOrder();
    }

    /**
     * Create an instance of {@link ArrayOfTick }
     * 
     */
    public ArrayOfTick createArrayOfTick() {
        return new ArrayOfTick();
    }

    /**
     * Create an instance of {@link Tick }
     * 
     */
    public Tick createTick() {
        return new Tick();
    }

    /**
     * Create an instance of {@link Security }
     * 
     */
    public Security createSecurity() {
        return new Security();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTicks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ArrayOfTicks")
    public JAXBElement<ArrayOfTicks> createArrayOfTicks(ArrayOfTicks value) {
        return new JAXBElement<ArrayOfTicks>(_ArrayOfTicks_QNAME, ArrayOfTicks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntradayChart }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "IntradayChart")
    public JAXBElement<IntradayChart> createIntradayChart(IntradayChart value) {
        return new JAXBElement<IntradayChart>(_IntradayChart_QNAME, IntradayChart.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BooleanResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "BooleanResult")
    public JAXBElement<BooleanResult> createBooleanResult(BooleanResult value) {
        return new JAXBElement<BooleanResult>(_BooleanResult_QNAME, BooleanResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DetailedBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "DetailedBook")
    public JAXBElement<DetailedBook> createDetailedBook(DetailedBook value) {
        return new JAXBElement<DetailedBook>(_DetailedBook_QNAME, DetailedBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Header }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "Header")
    public JAXBElement<Header> createHeader(Header value) {
        return new JAXBElement<Header>(_Header_QNAME, Header.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ticks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "Ticks")
    public JAXBElement<Ticks> createTicks(Ticks value) {
        return new JAXBElement<Ticks>(_Ticks_QNAME, Ticks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRealTimeQuote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ArrayOfRealTimeQuote")
    public JAXBElement<ArrayOfRealTimeQuote> createArrayOfRealTimeQuote(ArrayOfRealTimeQuote value) {
        return new JAXBElement<ArrayOfRealTimeQuote>(_ArrayOfRealTimeQuote_QNAME, ArrayOfRealTimeQuote.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExchangeTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ExchangeTime")
    public JAXBElement<ExchangeTime> createExchangeTime(ExchangeTime value) {
        return new JAXBElement<ExchangeTime>(_ExchangeTime_QNAME, ExchangeTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSearchResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ArrayOfSearchResult")
    public JAXBElement<ArrayOfSearchResult> createArrayOfSearchResult(ArrayOfSearchResult value) {
        return new JAXBElement<ArrayOfSearchResult>(_ArrayOfSearchResult_QNAME, ArrayOfSearchResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTop }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ArrayOfTop")
    public JAXBElement<ArrayOfTop> createArrayOfTop(ArrayOfTop value) {
        return new JAXBElement<ArrayOfTop>(_ArrayOfTop_QNAME, ArrayOfTop.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RealTimeQuote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "RealTimeQuote")
    public JAXBElement<RealTimeQuote> createRealTimeQuote(RealTimeQuote value) {
        return new JAXBElement<RealTimeQuote>(_RealTimeQuote_QNAME, RealTimeQuote.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfExtendedRealTimeQuote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ArrayOfExtendedRealTimeQuote")
    public JAXBElement<ArrayOfExtendedRealTimeQuote> createArrayOfExtendedRealTimeQuote(ArrayOfExtendedRealTimeQuote value) {
        return new JAXBElement<ArrayOfExtendedRealTimeQuote>(_ArrayOfExtendedRealTimeQuote_QNAME, ArrayOfExtendedRealTimeQuote.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Book }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "Book")
    public JAXBElement<Book> createBook(Book value) {
        return new JAXBElement<Book>(_Book_QNAME, Book.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Top }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "Top")
    public JAXBElement<Top> createTop(Top value) {
        return new JAXBElement<Top>(_Top_QNAME, Top.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChartDesign }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ChartDesign")
    public JAXBElement<ChartDesign> createChartDesign(ChartDesign value) {
        return new JAXBElement<ChartDesign>(_ChartDesign_QNAME, ChartDesign.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TickerTape }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "TickerTape")
    public JAXBElement<TickerTape> createTickerTape(TickerTape value) {
        return new JAXBElement<TickerTape>(_TickerTape_QNAME, TickerTape.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendedRealTimeQuote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ExtendedRealTimeQuote")
    public JAXBElement<ExtendedRealTimeQuote> createExtendedRealTimeQuote(ExtendedRealTimeQuote value) {
        return new JAXBElement<ExtendedRealTimeQuote>(_ExtendedRealTimeQuote_QNAME, ExtendedRealTimeQuote.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SingleTick }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "SingleTick")
    public JAXBElement<SingleTick> createSingleTick(SingleTick value) {
        return new JAXBElement<SingleTick>(_SingleTick_QNAME, SingleTick.class, null, value);
    }

}
