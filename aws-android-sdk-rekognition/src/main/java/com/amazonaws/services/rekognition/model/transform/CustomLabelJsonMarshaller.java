/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CustomLabel
 */
class CustomLabelJsonMarshaller {

    public void marshall(CustomLabel customLabel, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (customLabel.getName() != null) {
            String name = customLabel.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (customLabel.getConfidence() != null) {
            Float confidence = customLabel.getConfidence();
            jsonWriter.name("Confidence");
            jsonWriter.value(confidence);
        }
        if (customLabel.getGeometry() != null) {
            Geometry geometry = customLabel.getGeometry();
            jsonWriter.name("Geometry");
            GeometryJsonMarshaller.getInstance().marshall(geometry, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static CustomLabelJsonMarshaller instance;

    public static CustomLabelJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CustomLabelJsonMarshaller();
        return instance;
    }
}