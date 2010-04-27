package de.cosmocode.palava.media.expire;
/**
 * Copyright 2010 CosmoCode GmbH
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


import com.google.inject.Singleton;
import com.google.inject.name.Names;

import de.cosmocode.palava.cron.CronModule;

/**
 * Binds {@link AssetExpirationService} as {@link Singleton}.
 * 
 * @since 2.0
 * @author Willi Schoenborn
 */
public final class AssetExpirationServiceModule extends CronModule {

    @Override
    protected void configure() {
        bind(AssetExpirationService.class).in(Singleton.class);
        schedule(AssetExpirationService.class).using(Names.named(AssetExpirationServiceConfig.CRON_EXPRESSION));
    }

}
