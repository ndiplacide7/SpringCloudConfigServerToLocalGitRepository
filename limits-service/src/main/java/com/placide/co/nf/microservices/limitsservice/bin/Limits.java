package com.placide.co.nf.microservices.limitsservice.bin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Limits {
    private int minimum;
    private int maximum;
}
