package com.example.sweater.domain;

import lombok.*;
import javax.validation.constraints.NotBlank;
import javax.persistence.*;

import org.hibernate.validator.constraints.Length;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "Please, fill the message!")
    @Length(max = 2048, message = "Message too long (more then 2kB)!")
    private String text;
    @Length(max = 255, message = "Tag too long (more then 255)!")
    private String tag;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User author;

    private String filename;

    public String getAuthorName(){
        return author != null ? author.getUsername() : "<none>";
    }
}
