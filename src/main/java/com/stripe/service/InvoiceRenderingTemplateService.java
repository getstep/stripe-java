// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.InvoiceRenderingTemplate;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.InvoiceRenderingTemplateArchiveParams;
import com.stripe.param.InvoiceRenderingTemplateListParams;
import com.stripe.param.InvoiceRenderingTemplateRetrieveParams;
import com.stripe.param.InvoiceRenderingTemplateUnarchiveParams;

public final class InvoiceRenderingTemplateService extends ApiService {
  public InvoiceRenderingTemplateService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * List all templates, ordered by creation date, with the most recently created template appearing
   * first.
   */
  public StripeCollection<InvoiceRenderingTemplate> list(InvoiceRenderingTemplateListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /**
   * List all templates, ordered by creation date, with the most recently created template appearing
   * first.
   */
  public StripeCollection<InvoiceRenderingTemplate> list(RequestOptions options)
      throws StripeException {
    return list((InvoiceRenderingTemplateListParams) null, options);
  }
  /**
   * List all templates, ordered by creation date, with the most recently created template appearing
   * first.
   */
  public StripeCollection<InvoiceRenderingTemplate> list() throws StripeException {
    return list((InvoiceRenderingTemplateListParams) null, (RequestOptions) null);
  }
  /**
   * List all templates, ordered by creation date, with the most recently created template appearing
   * first.
   */
  public StripeCollection<InvoiceRenderingTemplate> list(
      InvoiceRenderingTemplateListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/invoice_rendering_templates";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(
        request, new TypeToken<StripeCollection<InvoiceRenderingTemplate>>() {}.getType());
  }
  /**
   * Retrieves an invoice rendering template with the given ID. It by default returns the latest
   * version of the template. Optionally, specify a version to see previous versions.
   */
  public InvoiceRenderingTemplate retrieve(
      String template, InvoiceRenderingTemplateRetrieveParams params) throws StripeException {
    return retrieve(template, params, (RequestOptions) null);
  }
  /**
   * Retrieves an invoice rendering template with the given ID. It by default returns the latest
   * version of the template. Optionally, specify a version to see previous versions.
   */
  public InvoiceRenderingTemplate retrieve(String template, RequestOptions options)
      throws StripeException {
    return retrieve(template, (InvoiceRenderingTemplateRetrieveParams) null, options);
  }
  /**
   * Retrieves an invoice rendering template with the given ID. It by default returns the latest
   * version of the template. Optionally, specify a version to see previous versions.
   */
  public InvoiceRenderingTemplate retrieve(String template) throws StripeException {
    return retrieve(template, (InvoiceRenderingTemplateRetrieveParams) null, (RequestOptions) null);
  }
  /**
   * Retrieves an invoice rendering template with the given ID. It by default returns the latest
   * version of the template. Optionally, specify a version to see previous versions.
   */
  public InvoiceRenderingTemplate retrieve(
      String template, InvoiceRenderingTemplateRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/invoice_rendering_templates/%s", ApiResource.urlEncodeId(template));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, InvoiceRenderingTemplate.class);
  }
  /**
   * Updates the status of an invoice rendering template to ‘archived’ so no new Stripe objects
   * (customers, invoices, etc.) can reference it. The template can also no longer be updated.
   * However, if the template is already set on a Stripe object, it will continue to be applied on
   * invoices generated by it.
   */
  public InvoiceRenderingTemplate archive(
      String template, InvoiceRenderingTemplateArchiveParams params) throws StripeException {
    return archive(template, params, (RequestOptions) null);
  }
  /**
   * Updates the status of an invoice rendering template to ‘archived’ so no new Stripe objects
   * (customers, invoices, etc.) can reference it. The template can also no longer be updated.
   * However, if the template is already set on a Stripe object, it will continue to be applied on
   * invoices generated by it.
   */
  public InvoiceRenderingTemplate archive(String template, RequestOptions options)
      throws StripeException {
    return archive(template, (InvoiceRenderingTemplateArchiveParams) null, options);
  }
  /**
   * Updates the status of an invoice rendering template to ‘archived’ so no new Stripe objects
   * (customers, invoices, etc.) can reference it. The template can also no longer be updated.
   * However, if the template is already set on a Stripe object, it will continue to be applied on
   * invoices generated by it.
   */
  public InvoiceRenderingTemplate archive(String template) throws StripeException {
    return archive(template, (InvoiceRenderingTemplateArchiveParams) null, (RequestOptions) null);
  }
  /**
   * Updates the status of an invoice rendering template to ‘archived’ so no new Stripe objects
   * (customers, invoices, etc.) can reference it. The template can also no longer be updated.
   * However, if the template is already set on a Stripe object, it will continue to be applied on
   * invoices generated by it.
   */
  public InvoiceRenderingTemplate archive(
      String template, InvoiceRenderingTemplateArchiveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/invoice_rendering_templates/%s/archive", ApiResource.urlEncodeId(template));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, InvoiceRenderingTemplate.class);
  }
  /** Unarchive an invoice rendering template so it can be used on new Stripe objects again. */
  public InvoiceRenderingTemplate unarchive(
      String template, InvoiceRenderingTemplateUnarchiveParams params) throws StripeException {
    return unarchive(template, params, (RequestOptions) null);
  }
  /** Unarchive an invoice rendering template so it can be used on new Stripe objects again. */
  public InvoiceRenderingTemplate unarchive(String template, RequestOptions options)
      throws StripeException {
    return unarchive(template, (InvoiceRenderingTemplateUnarchiveParams) null, options);
  }
  /** Unarchive an invoice rendering template so it can be used on new Stripe objects again. */
  public InvoiceRenderingTemplate unarchive(String template) throws StripeException {
    return unarchive(
        template, (InvoiceRenderingTemplateUnarchiveParams) null, (RequestOptions) null);
  }
  /** Unarchive an invoice rendering template so it can be used on new Stripe objects again. */
  public InvoiceRenderingTemplate unarchive(
      String template, InvoiceRenderingTemplateUnarchiveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/invoice_rendering_templates/%s/unarchive", ApiResource.urlEncodeId(template));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, InvoiceRenderingTemplate.class);
  }
}
