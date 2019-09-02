package com.axelor.gst.module;

import com.axelor.app.AxelorModule;
import com.axelor.apps.businessproject.service.InvoiceServiceProjectImpl;
import com.axelor.apps.supplychain.service.InvoiceLineSupplychainService;
import com.axelor.gst.service.GstInvoiceLineServiceImpl;
import com.axelor.gst.service.GstInvoiceServiceImpl;

public class GstModule extends AxelorModule {
  @Override
  protected void configure() {

    bind(InvoiceServiceProjectImpl.class).to(GstInvoiceServiceImpl.class);

    bind(InvoiceLineSupplychainService.class).to(GstInvoiceLineServiceImpl.class);
  }
}
