package com.namo.sqloptimisticlockdemo.service.impl;

import com.namo.sqloptimisticlockdemo.entity.Product;
import com.namo.sqloptimisticlockdemo.mapper.ProductMapper;
import com.namo.sqloptimisticlockdemo.service.IProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author namo
 * @since 2022-08-02
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {

}
