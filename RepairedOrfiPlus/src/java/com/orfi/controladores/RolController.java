package com.orfi.controladores;

import com.orfi.entity.Rol;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

@Named(value = "rolController")
@ViewScoped
public class RolController extends AbstractController<Rol> {

    public RolController() {
        // Inform the Abstract parent controller of the concrete Rol Entity
        super(Rol.class);
    }

    /**
     * Sets the "items" attribute with a collection of Persona entities that are
     * retrieved from Rol?cap_first and returns the navigation outcome.
     *
     * @return navigation outcome for Persona page
     */
    public String navigatePersonaList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Persona_items", this.getSelected().getPersonaList());
        }
        return "/protegido/admin/crud/pages/persona/index";
    }

    /**
     * Sets the "items" attribute with a collection of Permiso entities that are
     * retrieved from Rol?cap_first and returns the navigation outcome.
     *
     * @return navigation outcome for Permiso page
     */
    public String navigatePermisoList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Permiso_items", this.getSelected().getPermisoList());
        }
        return "/protegido/admin/crud/pages/permiso/index";
    }

}
