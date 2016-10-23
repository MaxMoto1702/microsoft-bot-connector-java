/**
 * Microsoft Bot Connector API - v3.0
 * ﻿The Bot Connector REST API allows your bot to send and receive messages to channels configured in the  [Bot Framework Developer Portal](https://dev.botframework.com). The Connector service uses industry-standard REST  and JSON over HTTPS.    Client libraries for this REST API are available. See below for a list.    Many bots will use both the Bot Connector REST API and the associated [Bot State REST API](/en-us/restapi/state). The  Bot State REST API allows a bot to store and retrieve state associated with users and conversations.    Authentication for both the Bot Connector and Bot State REST APIs is accomplished with JWT Bearer tokens, and is  described in detail in the [Connector Authentication](/en-us/restapi/authentication) document.    # Client Libraries for the Bot Connector REST API    * [Bot Builder for C#](/en-us/csharp/builder/sdkreference/)  * [Bot Builder for Node.js](/en-us/node/builder/overview/)  * Generate your own from the [Connector API Swagger file](https://raw.githubusercontent.com/Microsoft/BotBuilder/master/CSharp/Library/Microsoft.Bot.Connector/Swagger/ConnectorAPI.json)    © 2016 Microsoft
 * <p>
 * OpenAPI spec version: v3
 * Contact: botframework@microsoft.com
 * <p>
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.microsoft.bot.connector.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * A card representing a request to signing
 */
public class SigninCard {
    @SerializedName("text")
    private String text = null;

    @SerializedName("buttons")
    private List<CardAction> buttons = new ArrayList<CardAction>();

    public SigninCard text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Text for signin request
     *
     * @return text
     **/
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public SigninCard buttons(List<CardAction> buttons) {
        this.buttons = buttons;
        return this;
    }

    public SigninCard addButtonsItem(CardAction buttonsItem) {
        this.buttons.add(buttonsItem);
        return this;
    }

    /**
     * Action to use to perform signin
     *
     * @return buttons
     **/
    public List<CardAction> getButtons() {
        return buttons;
    }

    public void setButtons(List<CardAction> buttons) {
        this.buttons = buttons;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SigninCard signinCard = (SigninCard) o;
        return Objects.equals(this.text, signinCard.text) &&
                Objects.equals(this.buttons, signinCard.buttons);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, buttons);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SigninCard {\n");

        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb.append("    buttons: ").append(toIndentedString(buttons)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
