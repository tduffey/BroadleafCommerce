/*
 * Copyright 2008-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.broadleafcommerce.common.sandbox;

import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.Arrays;
import java.util.List;

/**
 * @author Jeff Fischer
 */
@Component("blSandBoxHelper")
public class DefaultSandBoxHelper implements SandBoxHelper {

    @Override
    public Long getSandBoxVersionId(EntityManager entityManager, Class<?> linkedObjectType, Long requestedParent) {
        return requestedParent;
    }

    @Override
    public List<Long> mergeCloneIds(EntityManager em, Class<?> type, Long... originalIds) {
        return Arrays.asList(originalIds);
    }
}
