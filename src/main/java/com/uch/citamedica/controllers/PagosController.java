package com.uch.citamedica.controllers;

import com.uch.citamedica.entities.Especialidad;
import com.uch.citamedica.entities.MetodoPago;
import com.uch.citamedica.entities.TipoMoneda;
import com.uch.citamedica.services.EspecialidadService;
import com.uch.citamedica.services.MetodoPagoService;
import com.uch.citamedica.services.TipoMonedaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@Controller
@RequestMapping("/pagos")
public class PagosController {

    private final TipoMonedaService tipoMonedaService;
    private final MetodoPagoService metodoPagoService;

    public PagosController(TipoMonedaService tipoMonedaService, MetodoPagoService metodoPagoService) {
        this.tipoMonedaService = tipoMonedaService;
        this.metodoPagoService = metodoPagoService;
    }

    @PostMapping("/guardar-tipo-moneda")
    public String guardarTipoMoneda(@ModelAttribute("tipoMoneda") TipoMoneda tipoMoneda) {
        tipoMonedaService.guardarTipoMoneda(tipoMoneda);
        return "redirect:/admin/pagos";
    }

    @PostMapping("/guardar-metodo-pago")
    public String guardarMetodoPago(@ModelAttribute("metodoPago") MetodoPago metodoPago) {
        metodoPagoService.guardarMetodoPago(metodoPago);
        return "redirect:/admin/pagos";
    }

    @GetMapping("/tipo-moneda/{id}")
    @ResponseBody
    public TipoMoneda obtenerTipoMoneda(@PathVariable Integer id) {
        TipoMoneda tipoMoneda = tipoMonedaService.buscarPorId(id);
        return Objects.requireNonNullElseGet(tipoMoneda, TipoMoneda::new);
    }

    @GetMapping("/metodo-pago/{id}")
    @ResponseBody
    public MetodoPago obtenerMetodoPago(@PathVariable Integer id) {
        MetodoPago metodoPago = metodoPagoService.buscarPorId(id);
        return Objects.requireNonNullElseGet(metodoPago, MetodoPago::new);
    }

    @GetMapping("/eliminar-tipo-moneda/{id}")
    public String eliminarTipoMoneda(@PathVariable("id") Integer id) {
        tipoMonedaService.eliminarTipoMoneda(id);
        return "redirect:/admin/pagos";
    }

    @GetMapping("/eliminar-metodo-pago/{id}")
    public String eliminarMetodoPago(@PathVariable("id") Integer id) {
        metodoPagoService.eliminarMetodoPago(id);
        return "redirect:/admin/pagos";
    }
}
