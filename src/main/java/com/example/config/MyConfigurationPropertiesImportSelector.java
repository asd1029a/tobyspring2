package com.example.config;

import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.util.MultiValueMap;

/**
 * MyConfigurationPropertiesImportSelector.java
 * Class 설명을 작성하세요.
 *
 * @author kjm
 * @since 2023.06.29
 */
public class MyConfigurationPropertiesImportSelector implements DeferredImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        MultiValueMap<String, Object> attr = importingClassMetadata.getAllAnnotationAttributes(EnableMyConfigrationProperties.class.getName());
        Class propertyClass =(Class) attr.getFirst("value");
        return new String[] {propertyClass.getName()};
    }
}
