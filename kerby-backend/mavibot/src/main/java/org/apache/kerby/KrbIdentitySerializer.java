/*
 *   Licensed to the Apache Software Foundation (ASF) under one
 *   or more contributor license agreements.  See the NOTICE file
 *   distributed with this work for additional information
 *   regarding copyright ownership.  The ASF licenses this file
 *   to you under the Apache License, Version 2.0 (the
 *   "License"); you may not use this file except in compliance
 *   with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing,
 *   software distributed under the License is distributed on an
 *   "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *   KIND, either express or implied.  See the License for the
 *   specific language governing permissions and limitations
 *   under the License.
 *
 */
package org.apache.kerby;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Comparator;

import org.apache.directory.mavibot.btree.serializer.BufferHandler;
import org.apache.directory.mavibot.btree.serializer.ElementSerializer;
import org.apache.kerby.kerberos.kerb.identity.KrbIdentity;

/**
 * Serializer class for KrbIdentity.
 *
 * @author <a href="mailto:dev@directory.apache.org">Apache Directory Project</a>
 */
public class KrbIdentitySerializer implements ElementSerializer<KrbIdentity> {
    /** the static instance of the serializer */
    public static final KrbIdentitySerializer INSTANCE = new KrbIdentitySerializer();

    /** comparator for KrbIdentity */
    private KrbIdentityComparator comparator = KrbIdentityComparator.INSTANCE;

    @Override
    public byte[] serialize(KrbIdentity key) {
        return null;
    }

    @Override
    public KrbIdentity deserialize(BufferHandler bufferHandler)
            throws IOException {
        return null;
    }

    @Override
    public KrbIdentity deserialize(ByteBuffer buffer) throws IOException {
        return null;
    }

    @Override
    public KrbIdentity fromBytes(byte[] buffer) throws IOException {
        return null;
    }

    @Override
    public KrbIdentity fromBytes(byte[] buffer, int pos) throws IOException {
        return null;
    }

    @Override
    public int compare(KrbIdentity type1, KrbIdentity type2) {
        return comparator.compare(type1, type2);
    }

    @Override
    public Comparator<KrbIdentity> getComparator() {
        return comparator;
    }

    @Override
    public Class<?> getType() {
        return KrbIdentity.class;
    }

}
