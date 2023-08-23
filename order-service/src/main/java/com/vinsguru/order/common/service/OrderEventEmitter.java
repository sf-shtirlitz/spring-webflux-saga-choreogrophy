package com.vinsguru.order.common.service;

import com.vinsguru.order.common.dto.PurchaseOrderDto;

public interface OrderEventEmitter {

    void emitOrderCreated(PurchaseOrderDto dto);

}
