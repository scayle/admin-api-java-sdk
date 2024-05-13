package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PromotionCondition implements ApiObjectInterface {
    /**
    * The list of conditions ('payload.*') that determines whether the promotion is applicable or not.
If `level = global`, a condition ('payload.*') that determines whether the promotion is applicable or not.
If `level = item`, a conditions ('item.*') that determines whether promotion is applicable or not for a particular item.

    */
    @SerializedName("level")
    String level;

    /**
    * Key of the condition. Can be used to identify which condition failed in the validate endpoint
    */
    @SerializedName("key")
    String key;

    /**
    * A Common Expression Language valid condition.

Available replacements keys:
`{{thisPromotionId}}` - will be replace on current promotion id, example:
```
"payload.customData.promotions.exists(i, i == '{{thisPromotionId}}')"
```

    */
    @SerializedName("condition")
    String condition;

}