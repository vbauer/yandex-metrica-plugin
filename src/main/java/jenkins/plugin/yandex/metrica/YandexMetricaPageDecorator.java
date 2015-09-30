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
