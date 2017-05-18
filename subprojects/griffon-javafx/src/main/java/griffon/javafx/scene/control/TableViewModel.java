/*
 * Copyright 2008-2017 the original author or authors.
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
package griffon.javafx.scene.control;

import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import javax.annotation.Nonnull;

/**
 * @author Andres Almiray
 * @since 2.11.0
 */
public interface TableViewModel<E> {
    @Nonnull
    ObservableList<E> getSource();

    @Nonnull
    TableViewFormat<E> getFormat();

    @Nonnull
    TableColumn<E,?> getColumnAt(int index);

    void attachTo(@Nonnull TableView<E> tableView);

    void detachFrom(@Nonnull TableView<E> tableView);
}
