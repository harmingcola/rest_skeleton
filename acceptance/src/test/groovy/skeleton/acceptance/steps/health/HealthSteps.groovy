package skeleton.acceptance.steps.health

import org.apache.http.HttpStatus
import org.apache.http.client.methods.HttpGet
import skeleton.acceptance.steps.BaseStep

this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)
this.metaClass.mixin(BaseStep)


Given(~/^the application is up and running$/) { ->
    // Intentionally empty
}

When(~/^I request the health status$/) { ->
    HttpGet httpGet = new HttpGet(serverUrl() + 'health')
    response = httpClient.execute(httpGet)
}

Then(~/^the application should be healthy$/) { ->
    assert response.getStatusLine().statusCode == HttpStatus.SC_OK
}