package com.example.study.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
@ToString(exclude = "members") @EqualsAndHashCode(of = "id")
@NoArgsConstructor @AllArgsConstructor
@Builder
@Entity
@Table(name = "tbl_team")
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "team_id")
    private Long id;

    private String name;

    @OneToMany(mappedBy = "team")
    @Builder.Default // 직접 선언한 값(new ArrayList<>();)이 디폴트 값으로
    private List<Member> members = new ArrayList<>();


}