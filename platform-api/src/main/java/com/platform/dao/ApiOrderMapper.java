package com.platform.dao;

import com.platform.entity.OrderVo;
import org.apache.ibatis.annotations.Param;
/**
 * 
 * 
 * @author lipengjun
 * @email 939961241@qq.com
 * @date 2017-08-11 09:16:46
 */
public interface ApiOrderMapper extends BaseDao<OrderVo> {
    /**
     * 根据订单编号查询订单
     *
     * @param order_sn
     * @return
     */
    OrderVo queryObjectByOrderSn(@Param("order_sn") String order_sn);

}
