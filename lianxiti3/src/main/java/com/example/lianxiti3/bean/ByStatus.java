package com.example.lianxiti3.bean;

import java.util.List;

public class ByStatus {

    /**
     * orderList : [{"detailList":[{"commentStatus":1,"commodityCount":1,"commodityId":12,"commodityName":"Lara style美妆BB蛋","commodityPic":"http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/2/1.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/2/2.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/2/3.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/2/4.jpg","commodityPrice":22,"orderDetailId":841},{"commentStatus":1,"commodityCount":1,"commodityId":4,"commodityName":"佩佩防晕染眼线液笔","commodityPic":"http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/2/1.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/2/2.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/2/3.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/2/4.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/2/5.jpg","commodityPrice":19,"orderDetailId":842}],"expressCompName":"京东快递","expressSn":"1001","orderId":"20190301115851202105","orderStatus":1,"payAmount":41,"payMethod":1,"userId":105},{"detailList":[{"commentStatus":1,"commodityCount":1,"commodityId":12,"commodityName":"Lara style美妆BB蛋","commodityPic":"http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/2/1.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/2/2.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/2/3.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/2/4.jpg","commodityPrice":22,"orderDetailId":784},{"commentStatus":1,"commodityCount":1,"commodityId":4,"commodityName":"佩佩防晕染眼线液笔","commodityPic":"http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/2/1.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/2/2.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/2/3.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/2/4.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/2/5.jpg","commodityPrice":19,"orderDetailId":785}],"expressCompName":"京东快递","expressSn":"1001","orderId":"20190228203436397105","orderStatus":1,"payAmount":41,"payMethod":1,"userId":105},{"detailList":[{"commentStatus":1,"commodityCount":1,"commodityId":12,"commodityName":"Lara style美妆BB蛋","commodityPic":"http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/2/1.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/2/2.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/2/3.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/2/4.jpg","commodityPrice":22,"orderDetailId":195},{"commentStatus":1,"commodityCount":1,"commodityId":4,"commodityName":"佩佩防晕染眼线液笔","commodityPic":"http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/2/1.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/2/2.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/2/3.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/2/4.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/2/5.jpg","commodityPrice":19,"orderDetailId":196}],"expressCompName":"京东快递","expressSn":"1001","orderId":"20190225185945694105","orderStatus":1,"payAmount":41,"payMethod":1,"userId":105}]
     * message : 查询成功
     * status : 0000
     */

    private String message;
    private String status;
    private List<OrderListBean> orderList;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<OrderListBean> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<OrderListBean> orderList) {
        this.orderList = orderList;
    }

    public static class OrderListBean {
        /**
         * detailList : [{"commentStatus":1,"commodityCount":1,"commodityId":12,"commodityName":"Lara style美妆BB蛋","commodityPic":"http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/2/1.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/2/2.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/2/3.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/2/4.jpg","commodityPrice":22,"orderDetailId":841},{"commentStatus":1,"commodityCount":1,"commodityId":4,"commodityName":"佩佩防晕染眼线液笔","commodityPic":"http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/2/1.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/2/2.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/2/3.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/2/4.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/2/5.jpg","commodityPrice":19,"orderDetailId":842}]
         * expressCompName : 京东快递
         * expressSn : 1001
         * orderId : 20190301115851202105
         * orderStatus : 1
         * payAmount : 41
         * payMethod : 1
         * userId : 105
         */

        private String expressCompName;
        private String expressSn;
        private String orderId;
        private String orderStatus;
        private String payAmount;
        private String payMethod;
        private String userId;
        private List<DetailListBean> detailList;

        public String getExpressCompName() {
            return expressCompName;
        }

        public void setExpressCompName(String expressCompName) {
            this.expressCompName = expressCompName;
        }

        public String getExpressSn() {
            return expressSn;
        }

        public void setExpressSn(String expressSn) {
            this.expressSn = expressSn;
        }

        public String getOrderId() {
            return orderId;
        }

        public void setOrderId(String orderId) {
            this.orderId = orderId;
        }

        public String getOrderStatus() {
            return orderStatus;
        }

        public void setOrderStatus(String orderStatus) {
            this.orderStatus = orderStatus;
        }

        public String getPayAmount() {
            return payAmount;
        }

        public void setPayAmount(String payAmount) {
            this.payAmount = payAmount;
        }

        public String getPayMethod() {
            return payMethod;
        }

        public void setPayMethod(String payMethod) {
            this.payMethod = payMethod;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public List<DetailListBean> getDetailList() {
            return detailList;
        }

        public void setDetailList(List<DetailListBean> detailList) {
            this.detailList = detailList;
        }

        public static class DetailListBean {
            /**
             * commentStatus : 1
             * commodityCount : 1
             * commodityId : 12
             * commodityName : Lara style美妆BB蛋
             * commodityPic : http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/2/1.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/2/2.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/2/3.jpg,http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/2/4.jpg
             * commodityPrice : 22
             * orderDetailId : 841
             */

            private String commentStatus;
            private String commodityCount;
            private String commodityId;
            private String commodityName;
            private String commodityPic;
            private String commodityPrice;
            private String orderDetailId;

            public String getCommentStatus() {
                return commentStatus;
            }

            public void setCommentStatus(String commentStatus) {
                this.commentStatus = commentStatus;
            }

            public String getCommodityCount() {
                return commodityCount;
            }

            public void setCommodityCount(String commodityCount) {
                this.commodityCount = commodityCount;
            }

            public String getCommodityId() {
                return commodityId;
            }

            public void setCommodityId(String commodityId) {
                this.commodityId = commodityId;
            }

            public String getCommodityName() {
                return commodityName;
            }

            public void setCommodityName(String commodityName) {
                this.commodityName = commodityName;
            }

            public String getCommodityPic() {
                return commodityPic;
            }

            public void setCommodityPic(String commodityPic) {
                this.commodityPic = commodityPic;
            }

            public String getCommodityPrice() {
                return commodityPrice;
            }

            public void setCommodityPrice(String commodityPrice) {
                this.commodityPrice = commodityPrice;
            }

            public String getOrderDetailId() {
                return orderDetailId;
            }

            public void setOrderDetailId(String orderDetailId) {
                this.orderDetailId = orderDetailId;
            }
        }
    }
}
