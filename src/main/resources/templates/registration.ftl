<#import "parts/common.ftl" as c>
<#import "parts/login.ftl" as l>

<@c.page>
    Registration page
    <div>
        ${exists!}
    </div>
    <@l.login "/registration" true/>
    <div>
        <a href="/login">Login</a>
    </div>
</@c.page>