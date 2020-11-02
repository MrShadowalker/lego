package com.lego.search.dao;

import com.lego.search.pojo.SkuInfo;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * 描述
 *
 * @author www.itheima.com
 * @version 1.0
 * @package com.lego.search.dao *
 * @since 1.0
 */
public interface SkuEsMapper extends ElasticsearchRepository<SkuInfo,Long> {
}
