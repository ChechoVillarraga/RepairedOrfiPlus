package com.orfi.controladores;

import com.orfi.entity.Disenio;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

@Named(value = "disenioController")
@ViewScoped
public class DisenioController extends AbstractController<Disenio> {

    public DisenioController() {
        // Inform the Abstract parent controller of the concrete Disenio Entity
        super(Disenio.class);
    }

    /**
     * Sets the "items" attribute with a collection of Joya entities that are
     * retrieved from Disenio?cap_first and returns the navigation outcome.
     *
     * @return navigation outcome for Joya page
     */
    public String navigateJoyaList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Joya_items", this.getSelected().getJoyaList());
        }
        return "/protegido/admin/crud/pages/joya/index";
    }

}
