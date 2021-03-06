/**
 * Copyright (c) 2017 Dell Inc., or its subsidiaries. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
package io.pravega.test.system.framework.metronome.model.v1;


import io.pravega.test.system.framework.metronome.ModelUtils;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class History {
    private int successCount;
    private int failureCount;
    private String lastSuccessAt;
    private String lastFailureAt;

    @Override
    public String toString() {
        return ModelUtils.toString(this);
    }
}
