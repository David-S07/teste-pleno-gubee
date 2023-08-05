package br.com.gubee.interview.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Hero {

    private UUID id;
    private String name;
    private String race;
    private UUID powerStatsId;
    private boolean enabled;
    private Date createdAt;
    private Date updatedAt;


}
