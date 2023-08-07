package com.ssh.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

/**
 * 
 * @TableName t_product
 */
@TableName(value ="t_product")
@Data
public class Product implements Serializable {
    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 商品名称
     */
    @TableField(value = "product_name")
    private String productName;

    /**
     * 商品价格
     */
    @TableField(value = "price")
    private Integer price;

    /**
     * 库存
     */
    @TableField(value = "stock")
    private Integer stock;

    /**
     * 商品图片
     */
    @TableField(value = "pro_pic")
    private String proPic;

    /**
     * 是否热卖
     */
    @TableField(value = "is_hot")
    private Boolean isHot;

    /**
     * 是否是轮播图
     */
    @TableField(value = "is_swiper")
    private Boolean isSwiper;

    /**
     * 轮播图地址
     */
    @TableField(value = "swiper_pic")
    private String swiperPic;

    /**
     * 轮播图排序
     */
    @TableField(value = "swiper_sort")
    private String swiperSort;

    /**
     * 小类商品ID
     */
    @TableField(value = "type_id")
    private Integer typeId;

    /**
     * 热卖时间
     */
    @JsonSerialize(using = CustomDateTimeSerializer.class)
    @TableField(value = "hot_date_time")
    private Date hotDateTime;

    /**
     * 商品介绍
     */
    @TableField(value = "product_intro_img")
    private String productIntroImg;

    /**
     * 商品参数
     */
    @TableField(value = "product_para_img")
    private String productParaImg;

    /**
     * 商品描述
     */
    @TableField(value = "product_desc")
    private String productDesc;

    /**
     * 发布时间
     */
    @JsonSerialize(using = CustomDateTimeSerializer.class)
    @TableField(value = "public_time")
    private String publicTime;

    /**
     * 销售量
     */
    @TableField(value = "sales_count")
    private String salesCount;

    /**
     * 真实销售量
     */
    @TableField(value = "real_sales_count")
    private String realSalesCount;

    /**
     * 发布人
     */
    @TableField(value = "public_by")
    private String publicBy;

    /**
     * 打折价格
     */
    @TableField(value = "discounted_price")
    private String discountedPrice;

    /**
     * 评论数
     */
    @TableField(value = "comment_count")
    private String commentCount;

    /**
     * 评论时间
     */
    @JsonSerialize(using = CustomDateTimeSerializer.class)
    @TableField(value = "comment_time")
    private String commentTime;

    /**
     * 评论状态
     */
    @TableField(value = "comment_status")
    private String commentStatus;

    /**
     * 商品描述
     */
    @TableField(value = "is_deleted")
    private String isDeleted;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}