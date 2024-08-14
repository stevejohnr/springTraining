package com.neueda.payments.control;

import com.neueda.payments.model.Payment;
import com.neueda.payments.service.PaymentsService;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/payment")
@CrossOrigin
public class PaymentController {

    private PaymentsService paymentsService;

    public PaymentController(PaymentsService paymentsService){
        this.paymentsService = paymentsService;
    }
    @GetMapping("")
    public List<Payment> getAllPayments(){
        return this.paymentsService.getAllPayments();
    }

    @GetMapping("/{id}")
    public Optional<Payment> getPaymentsById(@PathVariable Long id){
        return this.paymentsService.getPaymentsById(id);
    }
}
