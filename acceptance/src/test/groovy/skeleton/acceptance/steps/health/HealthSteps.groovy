package skeleton.acceptance.steps.health

import org.apache.http.HttpResponse
import org.apache.http.HttpStatus
import org.apache.http.client.methods.HttpGet
import skeleton.acceptance.steps.BaseStep

this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)
this.metaClass.mixin(BaseStep)

HttpResponse response

Given(~"the application is up and running") { ->
    // Intentionally empty
}

When(~"I send a request to the health endpoint") { ->
    HttpGet httpGet = new HttpGet(serverUrl() + 'healthcheck')
    response = httpClient.execute(httpGet)
}

Then(~"I should get a successful response") { ->
    assert response.getStatusLine().statusCode == HttpStatus.SC_OK
}