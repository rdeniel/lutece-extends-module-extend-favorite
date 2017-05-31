/*
 * Copyright (c) 2002-2015, Mairie de Paris
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the favoriteing conditions
 * are met:
 *
 *  1. Redistributions of source code must retain the above copyright notice
 *     and the favoriteing disclaimer.
 *
 *  2. Redistributions in binary form must reproduce the above copyright notice
 *     and the favoriteing disclaimer in the documentation and/or other materials
 *     provided with the distribution.
 *
 *  3. Neither the name of 'Mairie de Paris' nor 'Lutece' nor the names of its
 *     contributors may be used to endorse or promote products derived from
 *     this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDERS OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 *
 * License 1.0
 */
package fr.paris.lutece.plugins.extend.modules.favorite.service;

import fr.paris.lutece.plugins.extend.modules.favorite.business.FavoriteHistory;
import fr.paris.lutece.plugins.extend.modules.favorite.business.IFavoriteHistoryDAO;

import javax.inject.Inject;

/**
 *
 * favoriteService
 *
 */
public class FavoriteHistoryService implements IFavoriteHistoryService
{
    /** The Constant BEAN_SERVICE. */
    public static final String BEAN_SERVICE = "extendfavorite.favoriteHistoryService";
    @Inject
    private IFavoriteHistoryDAO _favoriteHistoryDAO;

    @Override
    public void remove( int nId )
    {
        _favoriteHistoryDAO.remove( nId, FavoritePlugin.getPlugin( ) );
    }

    @Override
    public void removeByResource( String strIdExtendableResource, String strExtendableResourceType )
    {
        _favoriteHistoryDAO.removeByResource( strIdExtendableResource, strExtendableResourceType, FavoritePlugin.getPlugin( ) );
    }

    @Override
    public void create( FavoriteHistory favoriteHistory )
    {
        _favoriteHistoryDAO.create( favoriteHistory, FavoritePlugin.getPlugin( ) );
    }

    @Override
    public FavoriteHistory findByHistoryExtenderId( long lIdHistoryExtenderId )
    {
        return _favoriteHistoryDAO.findByHistoryExtenderId( lIdHistoryExtenderId, FavoritePlugin.getPlugin( ) );
    }
}
