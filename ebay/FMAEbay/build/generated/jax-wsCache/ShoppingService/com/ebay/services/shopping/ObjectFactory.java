
package com.ebay.services.shopping;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ebay.services.shopping package. 
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

    private final static QName _GeteBayTimeRequest_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "GeteBayTimeRequest");
    private final static QName _GetSingleItemResponse_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "GetSingleItemResponse");
    private final static QName _FindProductsRequest_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "FindProductsRequest");
    private final static QName _FindProductsResponse_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "FindProductsResponse");
    private final static QName _GetUserProfileResponse_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "GetUserProfileResponse");
    private final static QName _GetCategoryInfoRequest_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "GetCategoryInfoRequest");
    private final static QName _GetUserProfileRequest_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "GetUserProfileRequest");
    private final static QName _FindPopularItemsRequest_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "FindPopularItemsRequest");
    private final static QName _FindPopularItemsResponse_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "FindPopularItemsResponse");
    private final static QName _FindReviewsAndGuidesResponse_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "FindReviewsAndGuidesResponse");
    private final static QName _GetShippingCostsRequest_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "GetShippingCostsRequest");
    private final static QName _FindPopularSearchesResponse_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "FindPopularSearchesResponse");
    private final static QName _GetCategoryInfoResponse_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "GetCategoryInfoResponse");
    private final static QName _FindReviewsAndGuidesRequest_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "FindReviewsAndGuidesRequest");
    private final static QName _FindHalfProductsRequest_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "FindHalfProductsRequest");
    private final static QName _GetMultipleItemsRequest_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "GetMultipleItemsRequest");
    private final static QName _GetMultipleItemsResponse_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "GetMultipleItemsResponse");
    private final static QName _GeteBayTimeResponse_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "GeteBayTimeResponse");
    private final static QName _FindHalfProductsResponse_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "FindHalfProductsResponse");
    private final static QName _GetItemStatusResponse_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "GetItemStatusResponse");
    private final static QName _FindPopularSearchesRequest_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "FindPopularSearchesRequest");
    private final static QName _GetItemStatusRequest_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "GetItemStatusRequest");
    private final static QName _GetShippingCostsResponse_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "GetShippingCostsResponse");
    private final static QName _GetSingleItemRequest_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "GetSingleItemRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ebay.services.shopping
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PopularSearchesType }
     * 
     */
    public PopularSearchesType createPopularSearchesType() {
        return new PopularSearchesType();
    }

    /**
     * Create an instance of {@link ShippingServiceOptionType }
     * 
     */
    public ShippingServiceOptionType createShippingServiceOptionType() {
        return new ShippingServiceOptionType();
    }

    /**
     * Create an instance of {@link CatalogProductType }
     * 
     */
    public CatalogProductType createCatalogProductType() {
        return new CatalogProductType();
    }

    /**
     * Create an instance of {@link GetMultipleItemsRequestType }
     * 
     */
    public GetMultipleItemsRequestType createGetMultipleItemsRequestType() {
        return new GetMultipleItemsRequestType();
    }

    /**
     * Create an instance of {@link ErrorParameterType }
     * 
     */
    public ErrorParameterType createErrorParameterType() {
        return new ErrorParameterType();
    }

    /**
     * Create an instance of {@link FindHalfProductsRequestType }
     * 
     */
    public FindHalfProductsRequestType createFindHalfProductsRequestType() {
        return new FindHalfProductsRequestType();
    }

    /**
     * Create an instance of {@link HistogramEntryType }
     * 
     */
    public HistogramEntryType createHistogramEntryType() {
        return new HistogramEntryType();
    }

    /**
     * Create an instance of {@link ShippingDetailsType }
     * 
     */
    public ShippingDetailsType createShippingDetailsType() {
        return new ShippingDetailsType();
    }

    /**
     * Create an instance of {@link TaxTableType }
     * 
     */
    public TaxTableType createTaxTableType() {
        return new TaxTableType();
    }

    /**
     * Create an instance of {@link HalfProductsType }
     * 
     */
    public HalfProductsType createHalfProductsType() {
        return new HalfProductsType();
    }

    /**
     * Create an instance of {@link GetUserProfileResponseType }
     * 
     */
    public GetUserProfileResponseType createGetUserProfileResponseType() {
        return new GetUserProfileResponseType();
    }

    /**
     * Create an instance of {@link DistanceType }
     * 
     */
    public DistanceType createDistanceType() {
        return new DistanceType();
    }

    /**
     * Create an instance of {@link BuyingGuideType }
     * 
     */
    public BuyingGuideType createBuyingGuideType() {
        return new BuyingGuideType();
    }

    /**
     * Create an instance of {@link SimpleUserType }
     * 
     */
    public SimpleUserType createSimpleUserType() {
        return new SimpleUserType();
    }

    /**
     * Create an instance of {@link FeedbackHistoryType }
     * 
     */
    public FeedbackHistoryType createFeedbackHistoryType() {
        return new FeedbackHistoryType();
    }

    /**
     * Create an instance of {@link CategoryType }
     * 
     */
    public CategoryType createCategoryType() {
        return new CategoryType();
    }

    /**
     * Create an instance of {@link DomainHistogramType }
     * 
     */
    public DomainHistogramType createDomainHistogramType() {
        return new DomainHistogramType();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link FindPopularSearchesRequestType }
     * 
     */
    public FindPopularSearchesRequestType createFindPopularSearchesRequestType() {
        return new FindPopularSearchesRequestType();
    }

    /**
     * Create an instance of {@link TaxJurisdictionType }
     * 
     */
    public TaxJurisdictionType createTaxJurisdictionType() {
        return new TaxJurisdictionType();
    }

    /**
     * Create an instance of {@link GetCategoryInfoResponseType }
     * 
     */
    public GetCategoryInfoResponseType createGetCategoryInfoResponseType() {
        return new GetCategoryInfoResponseType();
    }

    /**
     * Create an instance of {@link CharityType }
     * 
     */
    public CharityType createCharityType() {
        return new CharityType();
    }

    /**
     * Create an instance of {@link GetShippingCostsRequestType }
     * 
     */
    public GetShippingCostsRequestType createGetShippingCostsRequestType() {
        return new GetShippingCostsRequestType();
    }

    /**
     * Create an instance of {@link VATDetailsType }
     * 
     */
    public VATDetailsType createVATDetailsType() {
        return new VATDetailsType();
    }

    /**
     * Create an instance of {@link FindProductsResponseType }
     * 
     */
    public FindProductsResponseType createFindProductsResponseType() {
        return new FindProductsResponseType();
    }

    /**
     * Create an instance of {@link NameValueListType }
     * 
     */
    public NameValueListType createNameValueListType() {
        return new NameValueListType();
    }

    /**
     * Create an instance of {@link FindPopularItemsRequestType }
     * 
     */
    public FindPopularItemsRequestType createFindPopularItemsRequestType() {
        return new FindPopularItemsRequestType();
    }

    /**
     * Create an instance of {@link StorefrontType }
     * 
     */
    public StorefrontType createStorefrontType() {
        return new StorefrontType();
    }

    /**
     * Create an instance of {@link AmountType }
     * 
     */
    public AmountType createAmountType() {
        return new AmountType();
    }

    /**
     * Create an instance of {@link ErrorType }
     * 
     */
    public ErrorType createErrorType() {
        return new ErrorType();
    }

    /**
     * Create an instance of {@link PicturesType }
     * 
     */
    public PicturesType createPicturesType() {
        return new PicturesType();
    }

    /**
     * Create an instance of {@link GetCategoryInfoRequestType }
     * 
     */
    public GetCategoryInfoRequestType createGetCategoryInfoRequestType() {
        return new GetCategoryInfoRequestType();
    }

    /**
     * Create an instance of {@link ReviewType }
     * 
     */
    public ReviewType createReviewType() {
        return new ReviewType();
    }

    /**
     * Create an instance of {@link FeedbackDetailType }
     * 
     */
    public FeedbackDetailType createFeedbackDetailType() {
        return new FeedbackDetailType();
    }

    /**
     * Create an instance of {@link GetMultipleItemsResponseType }
     * 
     */
    public GetMultipleItemsResponseType createGetMultipleItemsResponseType() {
        return new GetMultipleItemsResponseType();
    }

    /**
     * Create an instance of {@link FindHalfProductsResponseType }
     * 
     */
    public FindHalfProductsResponseType createFindHalfProductsResponseType() {
        return new FindHalfProductsResponseType();
    }

    /**
     * Create an instance of {@link SimpleItemType }
     * 
     */
    public SimpleItemType createSimpleItemType() {
        return new SimpleItemType();
    }

    /**
     * Create an instance of {@link CategoryArrayType }
     * 
     */
    public CategoryArrayType createCategoryArrayType() {
        return new CategoryArrayType();
    }

    /**
     * Create an instance of {@link GetSingleItemResponseType }
     * 
     */
    public GetSingleItemResponseType createGetSingleItemResponseType() {
        return new GetSingleItemResponseType();
    }

    /**
     * Create an instance of {@link GetItemStatusResponseType }
     * 
     */
    public GetItemStatusResponseType createGetItemStatusResponseType() {
        return new GetItemStatusResponseType();
    }

    /**
     * Create an instance of {@link GetUserProfileRequestType }
     * 
     */
    public GetUserProfileRequestType createGetUserProfileRequestType() {
        return new GetUserProfileRequestType();
    }

    /**
     * Create an instance of {@link BuyingGuideDetailsType }
     * 
     */
    public BuyingGuideDetailsType createBuyingGuideDetailsType() {
        return new BuyingGuideDetailsType();
    }

    /**
     * Create an instance of {@link FindPopularItemsResponseType }
     * 
     */
    public FindPopularItemsResponseType createFindPopularItemsResponseType() {
        return new FindPopularItemsResponseType();
    }

    /**
     * Create an instance of {@link FeedbackPeriodType }
     * 
     */
    public FeedbackPeriodType createFeedbackPeriodType() {
        return new FeedbackPeriodType();
    }

    /**
     * Create an instance of {@link NameValueListArrayType }
     * 
     */
    public NameValueListArrayType createNameValueListArrayType() {
        return new NameValueListArrayType();
    }

    /**
     * Create an instance of {@link ReturnPolicyType }
     * 
     */
    public ReturnPolicyType createReturnPolicyType() {
        return new ReturnPolicyType();
    }

    /**
     * Create an instance of {@link VariationSpecificPictureSetType }
     * 
     */
    public VariationSpecificPictureSetType createVariationSpecificPictureSetType() {
        return new VariationSpecificPictureSetType();
    }

    /**
     * Create an instance of {@link AverageRatingDetailsType }
     * 
     */
    public AverageRatingDetailsType createAverageRatingDetailsType() {
        return new AverageRatingDetailsType();
    }

    /**
     * Create an instance of {@link GetItemStatusRequestType }
     * 
     */
    public GetItemStatusRequestType createGetItemStatusRequestType() {
        return new GetItemStatusRequestType();
    }

    /**
     * Create an instance of {@link SalesTaxType }
     * 
     */
    public SalesTaxType createSalesTaxType() {
        return new SalesTaxType();
    }

    /**
     * Create an instance of {@link GeteBayTimeResponseType }
     * 
     */
    public GeteBayTimeResponseType createGeteBayTimeResponseType() {
        return new GeteBayTimeResponseType();
    }

    /**
     * Create an instance of {@link VariationsType }
     * 
     */
    public VariationsType createVariationsType() {
        return new VariationsType();
    }

    /**
     * Create an instance of {@link SellingStatusType }
     * 
     */
    public SellingStatusType createSellingStatusType() {
        return new SellingStatusType();
    }

    /**
     * Create an instance of {@link ExternalProductIDType }
     * 
     */
    public ExternalProductIDType createExternalProductIDType() {
        return new ExternalProductIDType();
    }

    /**
     * Create an instance of {@link HalfCatalogProductType }
     * 
     */
    public HalfCatalogProductType createHalfCatalogProductType() {
        return new HalfCatalogProductType();
    }

    /**
     * Create an instance of {@link GeteBayTimeRequestType }
     * 
     */
    public GeteBayTimeRequestType createGeteBayTimeRequestType() {
        return new GeteBayTimeRequestType();
    }

    /**
     * Create an instance of {@link GetSingleItemRequestType }
     * 
     */
    public GetSingleItemRequestType createGetSingleItemRequestType() {
        return new GetSingleItemRequestType();
    }

    /**
     * Create an instance of {@link ShippingCostSummaryType }
     * 
     */
    public ShippingCostSummaryType createShippingCostSummaryType() {
        return new ShippingCostSummaryType();
    }

    /**
     * Create an instance of {@link BusinessSellerDetailsType }
     * 
     */
    public BusinessSellerDetailsType createBusinessSellerDetailsType() {
        return new BusinessSellerDetailsType();
    }

    /**
     * Create an instance of {@link VariationType }
     * 
     */
    public VariationType createVariationType() {
        return new VariationType();
    }

    /**
     * Create an instance of {@link ReviewDetailsType }
     * 
     */
    public ReviewDetailsType createReviewDetailsType() {
        return new ReviewDetailsType();
    }

    /**
     * Create an instance of {@link FindPopularSearchesResponseType }
     * 
     */
    public FindPopularSearchesResponseType createFindPopularSearchesResponseType() {
        return new FindPopularSearchesResponseType();
    }

    /**
     * Create an instance of {@link FindReviewsAndGuidesResponseType }
     * 
     */
    public FindReviewsAndGuidesResponseType createFindReviewsAndGuidesResponseType() {
        return new FindReviewsAndGuidesResponseType();
    }

    /**
     * Create an instance of {@link FindProductsRequestType }
     * 
     */
    public FindProductsRequestType createFindProductsRequestType() {
        return new FindProductsRequestType();
    }

    /**
     * Create an instance of {@link ProductIDType }
     * 
     */
    public ProductIDType createProductIDType() {
        return new ProductIDType();
    }

    /**
     * Create an instance of {@link GetShippingCostsResponseType }
     * 
     */
    public GetShippingCostsResponseType createGetShippingCostsResponseType() {
        return new GetShippingCostsResponseType();
    }

    /**
     * Create an instance of {@link FindReviewsAndGuidesRequestType }
     * 
     */
    public FindReviewsAndGuidesRequestType createFindReviewsAndGuidesRequestType() {
        return new FindReviewsAndGuidesRequestType();
    }

    /**
     * Create an instance of {@link SimpleItemArrayType }
     * 
     */
    public SimpleItemArrayType createSimpleItemArrayType() {
        return new SimpleItemArrayType();
    }

    /**
     * Create an instance of {@link InternationalShippingServiceOptionType }
     * 
     */
    public InternationalShippingServiceOptionType createInternationalShippingServiceOptionType() {
        return new InternationalShippingServiceOptionType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeteBayTimeRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "GeteBayTimeRequest")
    public JAXBElement<GeteBayTimeRequestType> createGeteBayTimeRequest(GeteBayTimeRequestType value) {
        return new JAXBElement<GeteBayTimeRequestType>(_GeteBayTimeRequest_QNAME, GeteBayTimeRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSingleItemResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "GetSingleItemResponse")
    public JAXBElement<GetSingleItemResponseType> createGetSingleItemResponse(GetSingleItemResponseType value) {
        return new JAXBElement<GetSingleItemResponseType>(_GetSingleItemResponse_QNAME, GetSingleItemResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindProductsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "FindProductsRequest")
    public JAXBElement<FindProductsRequestType> createFindProductsRequest(FindProductsRequestType value) {
        return new JAXBElement<FindProductsRequestType>(_FindProductsRequest_QNAME, FindProductsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindProductsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "FindProductsResponse")
    public JAXBElement<FindProductsResponseType> createFindProductsResponse(FindProductsResponseType value) {
        return new JAXBElement<FindProductsResponseType>(_FindProductsResponse_QNAME, FindProductsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserProfileResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "GetUserProfileResponse")
    public JAXBElement<GetUserProfileResponseType> createGetUserProfileResponse(GetUserProfileResponseType value) {
        return new JAXBElement<GetUserProfileResponseType>(_GetUserProfileResponse_QNAME, GetUserProfileResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCategoryInfoRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "GetCategoryInfoRequest")
    public JAXBElement<GetCategoryInfoRequestType> createGetCategoryInfoRequest(GetCategoryInfoRequestType value) {
        return new JAXBElement<GetCategoryInfoRequestType>(_GetCategoryInfoRequest_QNAME, GetCategoryInfoRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserProfileRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "GetUserProfileRequest")
    public JAXBElement<GetUserProfileRequestType> createGetUserProfileRequest(GetUserProfileRequestType value) {
        return new JAXBElement<GetUserProfileRequestType>(_GetUserProfileRequest_QNAME, GetUserProfileRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindPopularItemsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "FindPopularItemsRequest")
    public JAXBElement<FindPopularItemsRequestType> createFindPopularItemsRequest(FindPopularItemsRequestType value) {
        return new JAXBElement<FindPopularItemsRequestType>(_FindPopularItemsRequest_QNAME, FindPopularItemsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindPopularItemsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "FindPopularItemsResponse")
    public JAXBElement<FindPopularItemsResponseType> createFindPopularItemsResponse(FindPopularItemsResponseType value) {
        return new JAXBElement<FindPopularItemsResponseType>(_FindPopularItemsResponse_QNAME, FindPopularItemsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindReviewsAndGuidesResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "FindReviewsAndGuidesResponse")
    public JAXBElement<FindReviewsAndGuidesResponseType> createFindReviewsAndGuidesResponse(FindReviewsAndGuidesResponseType value) {
        return new JAXBElement<FindReviewsAndGuidesResponseType>(_FindReviewsAndGuidesResponse_QNAME, FindReviewsAndGuidesResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetShippingCostsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "GetShippingCostsRequest")
    public JAXBElement<GetShippingCostsRequestType> createGetShippingCostsRequest(GetShippingCostsRequestType value) {
        return new JAXBElement<GetShippingCostsRequestType>(_GetShippingCostsRequest_QNAME, GetShippingCostsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindPopularSearchesResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "FindPopularSearchesResponse")
    public JAXBElement<FindPopularSearchesResponseType> createFindPopularSearchesResponse(FindPopularSearchesResponseType value) {
        return new JAXBElement<FindPopularSearchesResponseType>(_FindPopularSearchesResponse_QNAME, FindPopularSearchesResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCategoryInfoResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "GetCategoryInfoResponse")
    public JAXBElement<GetCategoryInfoResponseType> createGetCategoryInfoResponse(GetCategoryInfoResponseType value) {
        return new JAXBElement<GetCategoryInfoResponseType>(_GetCategoryInfoResponse_QNAME, GetCategoryInfoResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindReviewsAndGuidesRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "FindReviewsAndGuidesRequest")
    public JAXBElement<FindReviewsAndGuidesRequestType> createFindReviewsAndGuidesRequest(FindReviewsAndGuidesRequestType value) {
        return new JAXBElement<FindReviewsAndGuidesRequestType>(_FindReviewsAndGuidesRequest_QNAME, FindReviewsAndGuidesRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindHalfProductsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "FindHalfProductsRequest")
    public JAXBElement<FindHalfProductsRequestType> createFindHalfProductsRequest(FindHalfProductsRequestType value) {
        return new JAXBElement<FindHalfProductsRequestType>(_FindHalfProductsRequest_QNAME, FindHalfProductsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMultipleItemsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "GetMultipleItemsRequest")
    public JAXBElement<GetMultipleItemsRequestType> createGetMultipleItemsRequest(GetMultipleItemsRequestType value) {
        return new JAXBElement<GetMultipleItemsRequestType>(_GetMultipleItemsRequest_QNAME, GetMultipleItemsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMultipleItemsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "GetMultipleItemsResponse")
    public JAXBElement<GetMultipleItemsResponseType> createGetMultipleItemsResponse(GetMultipleItemsResponseType value) {
        return new JAXBElement<GetMultipleItemsResponseType>(_GetMultipleItemsResponse_QNAME, GetMultipleItemsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeteBayTimeResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "GeteBayTimeResponse")
    public JAXBElement<GeteBayTimeResponseType> createGeteBayTimeResponse(GeteBayTimeResponseType value) {
        return new JAXBElement<GeteBayTimeResponseType>(_GeteBayTimeResponse_QNAME, GeteBayTimeResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindHalfProductsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "FindHalfProductsResponse")
    public JAXBElement<FindHalfProductsResponseType> createFindHalfProductsResponse(FindHalfProductsResponseType value) {
        return new JAXBElement<FindHalfProductsResponseType>(_FindHalfProductsResponse_QNAME, FindHalfProductsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItemStatusResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "GetItemStatusResponse")
    public JAXBElement<GetItemStatusResponseType> createGetItemStatusResponse(GetItemStatusResponseType value) {
        return new JAXBElement<GetItemStatusResponseType>(_GetItemStatusResponse_QNAME, GetItemStatusResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindPopularSearchesRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "FindPopularSearchesRequest")
    public JAXBElement<FindPopularSearchesRequestType> createFindPopularSearchesRequest(FindPopularSearchesRequestType value) {
        return new JAXBElement<FindPopularSearchesRequestType>(_FindPopularSearchesRequest_QNAME, FindPopularSearchesRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItemStatusRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "GetItemStatusRequest")
    public JAXBElement<GetItemStatusRequestType> createGetItemStatusRequest(GetItemStatusRequestType value) {
        return new JAXBElement<GetItemStatusRequestType>(_GetItemStatusRequest_QNAME, GetItemStatusRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetShippingCostsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "GetShippingCostsResponse")
    public JAXBElement<GetShippingCostsResponseType> createGetShippingCostsResponse(GetShippingCostsResponseType value) {
        return new JAXBElement<GetShippingCostsResponseType>(_GetShippingCostsResponse_QNAME, GetShippingCostsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSingleItemRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "GetSingleItemRequest")
    public JAXBElement<GetSingleItemRequestType> createGetSingleItemRequest(GetSingleItemRequestType value) {
        return new JAXBElement<GetSingleItemRequestType>(_GetSingleItemRequest_QNAME, GetSingleItemRequestType.class, null, value);
    }

}
