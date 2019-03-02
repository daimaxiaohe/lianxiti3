package com.example.lianxiti3.bean;

import java.util.List;

public class ShowCarBean {

    /**
     * result : [{"commodityId":19,"commodityName":"环球 时尚拼色街拍百搭小白鞋 韩版原宿ulzzang板鞋 女休闲鞋","count":1,"pic":"http://mobile.bwstudent.com/images/small/commodity/nx/bx/2/1.jpg","price":78},{"commodityId":25,"commodityName":"秋冬季真皮兔毛女鞋韩版休闲平底毛毛鞋软底百搭浅口水钻加绒棉鞋毛毛鞋潮鞋","count":1,"pic":"http://mobile.bwstudent.com/images/small/commodity/nx/ddx/1/1.jpg","price":158},{"commodityId":5,"commodityName":"双头两用修容笔","count":1,"pic":"http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/3/1.jpg","price":39},{"commodityId":5,"commodityName":"双头两用修容笔","count":1,"pic":"http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/3/1.jpg","price":39}]
     * message : 查询成功
     * status : 0000
     */

    private String message;
    private String status;
    private List<ResultBean> result;

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

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * commodityId : 19
         * commodityName : 环球 时尚拼色街拍百搭小白鞋 韩版原宿ulzzang板鞋 女休闲鞋
         * count : 1
         * pic : http://mobile.bwstudent.com/images/small/commodity/nx/bx/2/1.jpg
         * price : 78
         */

        private String commodityId;
        private String commodityName;
        private int count;
        private String pic;
        private double price;
        private boolean btncheck=false;

        public boolean isBtncheck() {
            return btncheck;
        }

        public void setBtncheck(boolean btncheck) {
            this.btncheck = btncheck;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
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

        public String getPic() {
            return pic;
        }

        public void setPic(String pic) {
            this.pic = pic;
        }


    }
}
