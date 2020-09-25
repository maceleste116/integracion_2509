package qa.stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.testng.Assert;
import qa.conf.DriverConfig;
import qa.pageobjects.HomeGrupoTarifarioServices;
import qa.tasks.*;


@CucumberContextConfiguration
@ContextConfiguration(classes = {DriverConfig.class})
public class GrupoTarifarioStepDefs {

    @Autowired
    private NavigateTo navigateTo;

    @Autowired
    private HomeGrupoTarifarioServices homeGrupoTarifarioServices;


    //CREAR GT CON DATOS REQUERIDOS
    @Given("actuario quiere crear grupo tarifario con datos requeridos")
    public void actuario_quiere_crear_grupo_tarifario_con_datos_requeridos() throws InterruptedException {
        navigateTo.homePage();
        Thread.sleep(5000);
        //homeGrupoTarifarioServices.writeInputNameUser("celesteberdinas@gmail.com");
        //Thread.sleep(1000);
        //homeGrupoTarifarioServices.writeInputPassword("Beauvoir.116");
        //homeGrupoTarifarioServices.clickOnButtonSubmit();

    }

    @When("actuario ingresa datos grupo tarifario requeridos")
    public void actuario_ingresa_datos_grupo_tarifario_requeridos() throws InterruptedException {
        System.out.println("Estamos");
    }

    @Then("actuario tiene grupo tarifario creado")
    public void actuario_tiene_grupo_tarifario_creado() {
        /*String mensaje = homeGrupoTarifarioServices.getStartPost();
        System.out.println("El mensaje obtenido es:" + mensaje);
        boolean contieneMensaje = mensaje.contains("Comienza");
        Assert.assertTrue(contieneMensaje);*/
        System.out.println("Estamos");
    }


/*
    //CREAT GT SIN DATOS REQUERIDOS
    @Given("actuario quiere crear grupo tarifario sin datos requeridos")
    public void actuario_quiere_crear_grupo_tarifario_sin_datos_requeridos() throws InterruptedException {
        navigateTo.homePage();
        Thread.sleep(5000);
        menuGrupoTarifario.IrMenuGrupoTarifario();
        Thread.sleep(1000);
    }

    @When("actuario no ingresa grupo tarifario tecnico requeridos")
    public void actuario_no_ingresa_grupo_tarifario_tecnico_requeridos() throws InterruptedException {
        crearGrupoTarifario.withOutInfoRequired();
        Thread.sleep(1000);
    }

    @Then("actuario no tiene grupo tarifario creado")
    public void actuario_no_tiene_grupo_tarifario_creado() {
        Assert.assertTrue(validarCrearGrupoTarifario.validarGrupoTarifarioWithOutInfoDefault());
    }

    //CREAT GT CON CODIGO EXISTENTE
    @Given("actuario quiere crear grupo tarifario con codigo existente")
    public void actuario_quiere_crear_grupo_tarifario_con_codigo_existente() throws InterruptedException {
        navigateTo.homePage();
        Thread.sleep(1000);
        menuGrupoTarifario.IrMenuGrupoTarifario();
        Thread.sleep(1000);
    }

    @When("actuario ingresa datos grupo tarifario con codigo existente")
    public void actuario_ingresa_datos_grupo_tarifario_con_codigo_existente() throws InterruptedException {
        crearGrupoTarifario.withCodigoExistente();
        Thread.sleep(1000);
    }

    @Then("actuario no tiene grupo tarifario creado con codigo existente")
    public void actuario_no_tiene_grupo_tarifario_creado_con_codigo_existente() {
        Assert.assertTrue(validarCrearGrupoTarifario.validarGrupoTarifarioWithCodigoExiste());
    }


    //EDITAR GT CON DATOS REQUERIDOS
    @Given("actuario quiere modificar grupo tarifario existente")
    public void actuario_quiere_modificar_grupo_tarifario_existente() throws InterruptedException {
        navigateTo.homePage();
        Thread.sleep(1000);
        menuGrupoTarifario.IrMenuGrupoTarifario();
        Thread.sleep(1000);
    }

    @When("actuario selecciona grupo tarifario a modificar")
    public void actuario_selecciona_grupo_tarifario_a_modificar() throws InterruptedException {
        editarGrupoTarifario.withInfoRequired();
        Thread.sleep(1000);
    }

    @Then("actuario tiene grupo tarifario modificado")
    public void actuario_tiene_grupo_tarifario_modificado() {
        Assert.assertTrue(validarEditarGrupoTarifario.validarGrupoTarifarioEditarWithInfoDefault());
    }

    //EDITAR GT SIN DATOS REQUERIDOS
    @Given("actuario quiere modificar grupo tarifario existente sin datos requeridos")
    public void actuario_quiere_modificar_grupo_tarifario_existente_sin_datos_requeridos() throws InterruptedException {
        navigateTo.homePage();
        Thread.sleep(1000);
        menuGrupoTarifario.IrMenuGrupoTarifario();
        Thread.sleep(1000);

    }

    @When("actuario selecciona grupo tarifario a modificar sin datos requeridos")
    public void actuario_selecciona_grupo_tarifario_a_modificar_sin_datos_requeridos() throws InterruptedException {
        editarGrupoTarifario.withOutInfoRequired();
        Thread.sleep(1000);
    }

    @Then("actuario no tiene grupo tarifario modificado sin datos requeridos")
    public void actuario_no_tiene_grupo_tarifario_modificado_sin_datos_requeridos() {
        Assert.assertTrue(validarEditarGrupoTarifario.validarProductoTecnicoEditarWithOutInfoDefault());
    }



    //ELIMINAR GT CANCELAR
    @Given("actuario quiere eliminar grupo tarifario existente cancelar")
    public void actuario_quiere_eliminar_grupo_tarifario_existente_cancelar() throws InterruptedException {
        navigateTo.homePage();
        Thread.sleep(1000);
        menuGrupoTarifario.IrMenuGrupoTarifario();
        Thread.sleep(1000);
    }

    @When("actuario selecciona grupo tarifario a eliminar cancelar")
    public void actuario_selecciona_grupo_tarifario_a_eliminar_cancelar() throws InterruptedException {
        eliminarGrupoTarifario.deleteCancelarGrupoTarifario();
        Thread.sleep(1000);
    }

    @Then("actuario no tiene grupo tarifario eliminado cancelar")
    public void actuario_no_tiene_grupo_tarifario_eliminado_cancelar() throws InterruptedException {
        Assert.assertTrue(validarEliminarGrupoTarifario.validarGrupoTarifarioEliminarCancelar());
        Thread.sleep(1000);
    }

    //ELIMINAR GT ACEPTAR
    @Given("actuario quiere eliminar grupo tarifario existente aceptar")
    public void actuario_quiere_eliminar_grupo_tarifario_existente_aceptar() throws InterruptedException {
        navigateTo.homePage();
        Thread.sleep(1000);
        menuGrupoTarifario.IrMenuGrupoTarifario();
        Thread.sleep(1000);
    }

    @When("actuario selecciona grupo tarifario a eliminar aceptar")
    public void actuario_selecciona_grupo_tarifario_a_eliminar_aceptar() throws InterruptedException {
        eliminarGrupoTarifario.deleteAceptarGrupoTarifario();
        Thread.sleep(1000);
    }

    @Then("actuario tiene grupo tarifario eliminado aceptar")
    public void actuario_tiene_grupo_tarifario_eliminado_aceptar() throws InterruptedException {
        Assert.assertTrue(validarEliminarGrupoTarifario.validarGrupoTarifarioEliminarAceptar());
        Thread.sleep(1000);

    }

    //LISTAR ASCENDENTE GRUPO TARIFARIO
    @Given("actuario quiere ordenar ascendente grupo tarifario existente")
    public void actuario_quiere_ordenar_ascendente_grupo_tarifario_existente() throws InterruptedException {
        navigateTo.homePage();
        Thread.sleep(1000);
        menuGrupoTarifario.IrMenuGrupoTarifario();
        Thread.sleep(1000);
    }

    @When("actuario selecciona ordenar ascendente grupo tarifario existente")
    public void actuario_selecciona_ordenar_ascendente_grupo_tarifario_existente() throws InterruptedException {
        listarGrupoTarifario.listarAscendenteGrupoTarifario();
        Thread.sleep(1000);

    }

    @Then("actuario tiene ordenado ascendente grupo tarifario existente")
    public void actuario_tiene_ordenado_ascendente_grupo_tarifario_existente() {
        Assert.assertTrue(validarListarGrupoTarifario.validarGrupoTarifarioSortAsc());
    }

    //LISTAR DESCENDENTE GRUPO TARIFARIO
    @Given("actuario quiere ordenar descentente grupo tarifario existente")
    public void actuario_quiere_ordenar_descentente_grupo_tarifario_existente() throws InterruptedException {
        navigateTo.homePage();
        Thread.sleep(1000);
        menuGrupoTarifario.IrMenuGrupoTarifario();
        Thread.sleep(1000);
    }

    @When("actuario selecciona ordenar descentente grupo tarifario existente")
    public void actuario_selecciona_ordenar_descentente_grupo_tarifario_existente() throws InterruptedException {
        listarGrupoTarifario.listarDescendenteGrupoTarifario();
        Thread.sleep(1000);
    }

    @Then("actuario tiene ordenado descentente grupo tarifario existente")
    public void actuario_tiene_ordenado_descentente_grupo_tarifario_existente() {
        Assert.assertTrue(validarListarGrupoTarifario.validarGrupoTarifarioSortDesc());
    }

*/

}
