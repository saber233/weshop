package tech.wetech.weshop.service;

import tech.wetech.weshop.domain.Goods;

import java.util.List;

/**
 * @author cjbi
 */
public interface GoodsService extends IService<Goods> {

    List<Goods> queryGoodsByCategoryIdIn(List<Integer> categoryIds);

}