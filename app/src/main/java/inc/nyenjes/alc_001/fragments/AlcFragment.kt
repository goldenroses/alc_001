package inc.nyenjes.alc_001.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient

import inc.nyenjes.alc_001.R
import kotlinx.android.synthetic.main.fragment_alc.*

class AlcFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.fragment_alc, container, false)
        val webview = view.findViewById<WebView>(R.id.webview)
        webview?.webViewClient = object: WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, request: WebResourceRequest?): Boolean {
                return true
            }
        }
        webview.loadUrl("https://andela.com/alc/")
        return view
    }
}
