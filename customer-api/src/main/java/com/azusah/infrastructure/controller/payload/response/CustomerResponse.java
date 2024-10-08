package com.azusah.infrastructure.controller.payload.response;

import java.math.BigDecimal;

public class CustomerResponse {

    private final Long id;
    private final String name;
    private final BigDecimal purchaseLimitValue;
    private final Integer invoiceClosingDay;

    public CustomerResponse(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.purchaseLimitValue = builder.purchaseLimitValue;
        this.invoiceClosingDay = builder.invoiceClosingDay;
    }

    public static Builder builder() {
        return new Builder();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPurchaseLimitValue() {
        return purchaseLimitValue;
    }

    public Integer getInvoiceClosingDay() {
        return invoiceClosingDay;
    }

    @Override
    public String toString() {
        return "CustomerResponse{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", purchaseLimitValue=" + purchaseLimitValue +
                ", invoiceClosingDay=" + invoiceClosingDay +
                '}';
    }

    public static class Builder {
        private Long id;
        private String name;
        private BigDecimal purchaseLimitValue;
        private Integer invoiceClosingDay;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder purchaseLimitValue(BigDecimal value) {
            this.purchaseLimitValue = value;
            return this;
        }

        public Builder invoiceClosingDay(Integer dayOfMonth) {
            this.invoiceClosingDay = dayOfMonth;
            return this;
        }

        public CustomerResponse build() {
            return new CustomerResponse(this);
        }
    }
}
