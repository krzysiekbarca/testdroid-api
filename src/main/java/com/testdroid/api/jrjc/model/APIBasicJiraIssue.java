package com.testdroid.api.jrjc.model;

import com.testdroid.api.APIEntity;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.net.URI;

/**
 *
 * @author kajdus
 */
@XmlRootElement(name = "APIBasicJiraIssue", namespace = "cloud.testdroid.api.jira.model")
@XmlType(name="APIBasicJiraIssue", namespace = "cloud.testdroid.api.jira.model")
public class APIBasicJiraIssue extends APIEntity {

    private URI self;
    private String key;
    private Long id;

    public APIBasicJiraIssue(){

    }

    public APIBasicJiraIssue(URI self, String key, Long id) {
        this.self = self;
        this.key = key;
        this.id = id;
    }

    /**
     * @return URI of this issue
     */
    public URI getSelf() {
        return self;
    }

    /**
     * @return issue key
     */
    public String getKey() {
        return key;
    }

    /**
     * @return issue id
     */
    public Long getId() {
        return id;
    }

    @Override protected <T extends APIEntity> void clone(T from) {

    }

}
