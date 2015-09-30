/*
 * The MIT License
 * Copyright (c) 2015 Vladislav Bauer
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package jenkins.plugin.yandex.metrica;

import hudson.Extension;
import hudson.Util;
import hudson.model.PageDecorator;
import net.sf.json.JSONObject;
import org.kohsuke.stapler.StaplerRequest;

/**
 * @author Vladislav Bauer
 */

@SuppressWarnings("unused")
@Extension
public class YandexMetricaPageDecorator extends PageDecorator {

    private static final String DISPLAY_NAME = "Yandex Metrica";
    private static final String PARAM_COUNTER_ID = "counterId";

    private String counterId;


    public YandexMetricaPageDecorator() {
        super(YandexMetricaPageDecorator.class);
        load();
    }


    @Override
    public String getDisplayName() {
        return DISPLAY_NAME;
    }

    @Override
    public boolean configure(final StaplerRequest req, final JSONObject json) throws FormException {
        counterId = Util.fixEmptyAndTrim(json.getString(PARAM_COUNTER_ID));
        save();
        return super.configure(req, json);
    }

    public String getCounterId() {
        return counterId;
    }

}
