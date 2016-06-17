/*
 * Copyright 2016 the original author or authors.
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
import griffon.util.AbstractMapResourceBundle;

import javax.annotation.Nonnull;
import java.util.Map;

import static griffon.util.CollectionUtils.map;
import static java.util.Arrays.asList;

public class Config extends AbstractMapResourceBundle {
    @Override
    protected void initialize(@Nonnull Map<String, Object> entries) {
        map(entries)
            .e("application", map()
                    .e("title", "JavaFX Views")
                    .e("startupGroups", asList("app"))
                    .e("autoShutdown", true)
            )
            .e("mvcGroups", map()
                    .e("app", map()
                            .e("view", "org.example.AppView")
                    )
                    .e("tab1", map()
                            .e("model", "org.example.SampleModel")
                            .e("view", "org.example.Tab1View")
                            .e("controller", "org.example.SampleController")
                    )
                    .e("tab2", map()
                            .e("model", "org.example.SampleModel")
                            .e("view", "org.example.Tab2View")
                            .e("controller", "org.example.SampleController")
                    )
                    .e("tab3", map()
                            .e("model", "org.example.SampleModel")
                            .e("view", "org.example.Tab3View")
                            .e("controller", "org.example.SampleController")
                    )
                    .e("tab4", map()
                            .e("model", "org.example.SampleModel")
                            .e("view", "org.example.Tab4View")
                            .e("controller", "org.example.SampleController")
                    )
            );
    }
}