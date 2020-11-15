package modelo;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import service.ThemeService;

@Named
@RequestScoped
public class SelectOneView {

    private String option;
    private Theme theme;
    private List<Theme> themes;

    @Inject
    private ThemeService service;

    @PostConstruct
    public void init() {
        themes = service.getThemes();
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public Theme getTheme() {
        return theme;
    }

    public void setTheme(Theme theme) {
        this.theme = theme;
    }

    public List<Theme> getThemes() {
        return themes;
    }

    public void setService(ThemeService service) {
        this.service = service;
    }

}
