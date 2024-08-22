package com.shan.lease.web.admin.custom.converter;

import com.shan.lease.model.enums.BaseEnum;
import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.converter.ConverterFactory;
import org.springframework.stereotype.Component;

/**
 * @Author: Steven
 * @Date: 2024/8/21
 * @Time: 上午11:20
 * @Description:
 */
@Component
public class StringToBaseEnumConverterFactory implements ConverterFactory<String, BaseEnum> {
    @Override
    public <T extends BaseEnum> Converter<String, T> getConverter(Class<T> targetType) {

        return new Converter<String, T>() {

            @Override
            public T convert(String code) {
                T[] enumConstants = targetType.getEnumConstants();
                for (T enumConstant : enumConstants) {
                    if(enumConstant.getCode().equals(Integer.valueOf(code)))
                        return enumConstant;
                }
                throw new IllegalArgumentException("code " + code + " 非法");
            }
        };
    }
}
