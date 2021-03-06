/*
 * Copyright 2020-2020 Exactpro (Exactpro Systems Limited)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.exactpro.th2.conn.utility

import com.exactpro.th2.common.grpc.EventID

enum class MetadataProperty(val propertyName: String, val propertyClass: Class<*>) {
    PARENT_EVENT_ID("th2ParentEventID", EventID::class.java);

    operator fun component1(): String = propertyName
    operator fun component2(): Class<*> = propertyClass

    companion object {
        fun fromString(propertyName: String): MetadataProperty? = values().find { it.propertyName == propertyName }
    }
}