--
-- Init core_template
--

INSERT INTO core_template VALUES ('extend_favorite','\r\n<#if !favoriteClosed>	<#if canDeleteFavorite>	<div>		<p> #i18n{module.extend.favorite.extender.closed.label} : 		<a href="jsp/site/plugins/extend/modules/favorite/DoCancelFavorite.jsp?idExtendableResource=${idExtendableResource!}&extendableResourceType=${extendableResourceType!}" > #i18n{module.extend.favorite.extender.cancelFavorite.label}</a>		</p>	</div>	</#if>	<#if show == "all" || show == "actionFavorite">		<#if canFavorite && !canDeleteFavorite >		<div>			<span><a href="jsp/site/plugins/extend/modules/favorite/DoFavorite.jsp?idExtendableResource=${idExtendableResource!}&extendableResourceType=${extendableResourceType!}&favoriteValue=1"> #i18n{module.extend.favorite.extender.doFavorite.label}</a></span>		</div>		</#if>	</#if>\r\n</#if><#if favorite??><p> #i18n{module.extend.favorite.extender.count.label} :  ${favorite.favoriteCount} </p></#if>');