package com.zk.mall.mbg.model;

import java.io.Serializable;

public class PmsBrand implements Serializable {
    private Long id;

    private String name;

    /**
     * é¦–å­—æ¯
     *
     * @mbggenerated
     */
    private String firstLetter;

    private String sort;

    /**
     * æ˜¯å¦ä¸ºå“ç‰Œåˆ¶é€ å•†ï¼š0->ä¸æ˜¯ï¼›1->æ˜¯
     *
     * @mbggenerated
     */
    private Integer factoryStatus;

    private Integer showStatus;

    /**
     * äº§å“æ•°é‡
     *
     * @mbggenerated
     */
    private Integer productCount;

    private Integer productCommentCount;

    /**
     * å“ç‰Œlogo
     *
     * @mbggenerated
     */
    private String logo;

    /**
     * ä¸“åŒºå¤§å›¾
     *
     * @mbggenerated
     */
    private String bigPic;

    private String brandStory;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstLetter() {
        return firstLetter;
    }

    public void setFirstLetter(String firstLetter) {
        this.firstLetter = firstLetter;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public Integer getFactoryStatus() {
        return factoryStatus;
    }

    public void setFactoryStatus(Integer factoryStatus) {
        this.factoryStatus = factoryStatus;
    }

    public Integer getShowStatus() {
        return showStatus;
    }

    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }

    public Integer getProductCount() {
        return productCount;
    }

    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    public Integer getProductCommentCount() {
        return productCommentCount;
    }

    public void setProductCommentCount(Integer productCommentCount) {
        this.productCommentCount = productCommentCount;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getBigPic() {
        return bigPic;
    }

    public void setBigPic(String bigPic) {
        this.bigPic = bigPic;
    }

    public String getBrandStory() {
        return brandStory;
    }

    public void setBrandStory(String brandStory) {
        this.brandStory = brandStory;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", firstLetter=").append(firstLetter);
        sb.append(", sort=").append(sort);
        sb.append(", factoryStatus=").append(factoryStatus);
        sb.append(", showStatus=").append(showStatus);
        sb.append(", productCount=").append(productCount);
        sb.append(", productCommentCount=").append(productCommentCount);
        sb.append(", logo=").append(logo);
        sb.append(", bigPic=").append(bigPic);
        sb.append(", brandStory=").append(brandStory);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}