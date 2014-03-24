package com.testdroid.api.model;

import com.testdroid.api.APIEntity;
import javax.xml.bind.annotation.XmlRootElement;
import org.codehaus.jackson.annotate.JsonIgnore;

/**
 *
 * @author Michał Szpruta <michal.szpruta@bitbar.com>
 */
@XmlRootElement
public class APIUserFileTag extends APIEntity {

    private String name;

    public APIUserFileTag() {
    }

    public APIUserFileTag(Long id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    @JsonIgnore
    protected <T extends APIEntity> void clone(T from) {
        APIUserFileTag apiUserFileTag = (APIUserFileTag) from;
        cloneBase(from);
        this.name = apiUserFileTag.name;
    }
}