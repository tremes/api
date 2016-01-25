/*
 * JBoss, Home of Professional Open Source
 * Copyright 2015, Red Hat, Inc., and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.weld.experimental;

import javax.enterprise.inject.spi.AfterBeanDiscovery;

/**
 * This API is experimental and will change! All the methods declared by this interface are supposed to be moved to {@link AfterBeanDiscovery}.
 *
 * @seeIssue WELD-1795
 * @author Martin Kouba
 */
public interface ExperimentalAfterBeanDiscovery extends AfterBeanDiscovery {

    /**
     * The {@link BeanBuilder#build()} is invoked automatically and the resulting bean is registered after all observers are notified.
     *
     * @return a builder for a custom bean
     */
    <T> BeanBuilder<T> addBean();

    /**
     *
     * @return a builder for a custom bean
     */
    <T> BeanBuilder<T> beanBuilder();

    /**
     *
     * @return a builder for a custom interceptor
     */
    <T> InterceptorBuilder addInterceptor();

    /**
     *
     * @return a builder for interceptor
     */
    <T> InterceptorBuilder interceptorBuilder();

}
