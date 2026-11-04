package com.system.tradingplatform;

@FunctionalInterface
public interface TradeAlert {

	boolean alerts(Trade Obj);
}
